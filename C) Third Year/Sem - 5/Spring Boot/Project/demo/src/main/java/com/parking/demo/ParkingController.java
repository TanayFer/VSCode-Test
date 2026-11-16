package com.parking.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/api/parking")
public class ParkingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ParkingController.class);
    private final SlotRepository repo;

    public ParkingController(SlotRepository repo) {
        this.repo = repo;
    }

    @PostConstruct
    public void initSlots() {
        for (int i = 1; i <= 4; i++) {
            createSlotIfMissing("C-0" + i, "COMPACT");
        }
        for (int i = 1; i <= 2; i++) {
            createSlotIfMissing("S-0" + i, "SUV");
        }
        printConsoleDashboard("SYSTEM READY: PARKING SLOTS VERIFIED");
    }

    @PostMapping("/park")
    public synchronized String parkVehicle(@RequestParam String vehicleNo, @RequestParam String type) {
        String normalizedVehicleNo = vehicleNo == null ? "" : vehicleNo.trim().toUpperCase(Locale.ROOT);
        String normalizedType = type == null ? "" : type.trim().toUpperCase(Locale.ROOT);

        if (normalizedVehicleNo.isEmpty()) {
            return "ERROR: Enter a valid vehicle number.";
        }
        if (!normalizedVehicleNo.matches("[A-Z0-9-]{3,15}")) {
            return "ERROR: Vehicle number must contain 3-15 letters, numbers, or hyphens.";
        }
        if (!normalizedType.equals("COMPACT") && !normalizedType.equals("SUV")) {
            return "ERROR: Vehicle type must be COMPACT or SUV.";
        }
        if (repo.existsByVehicleNumber(normalizedVehicleNo)) {
            return "ERROR: Vehicle is already parked.";
        }

        List<ParkingSlot> freeSlots = repo.findByTypeAndOccupiedFalseOrderBySlotIdAsc(normalizedType);
        if (freeSlots.isEmpty()) {
            printConsoleDashboard("REJECTED: NO " + normalizedType + " SLOTS AVAILABLE FOR " + normalizedVehicleNo);
            return "LOT FULL for " + normalizedType;
        }

        ParkingSlot slot = freeSlots.get(0);
        slot.setOccupied(true);
        slot.setVehicleNumber(normalizedVehicleNo);
        slot.setEntryTime(LocalDateTime.now(ZoneId.systemDefault()));
        repo.save(slot);

        String msg = "ENTRY: " + slot.getVehicleNumber() + " -> ASSIGNED SLOT " + slot.getSlotId();
        printConsoleDashboard(msg);
        return msg;
    }

    @PostMapping("/exit")
    public synchronized String exitVehicle(@RequestParam String slotId, @RequestParam(defaultValue = "2") long simulatedHours) {
        if (slotId == null || slotId.trim().isEmpty()) {
            return "ERROR: Enter a slot ID.";
        }
        if (simulatedHours < 1 || simulatedHours > 24) {
            return "ERROR: Duration must be between 1 and 24 hours.";
        }

        String normalizedSlotId = slotId.trim().toUpperCase(Locale.ROOT);
        ParkingSlot slot = repo.findById(normalizedSlotId).orElse(null);
        if (slot == null || !slot.isOccupied()) {
            return "ERROR: Invalid or already empty Slot ID (" + normalizedSlotId + ")";
        }

        long totalSlots = repo.count();
        long occupiedCount = repo.countByOccupiedTrue();
        double occupancyRate = totalSlots == 0 ? 0 : (double) occupiedCount / totalSlots;

        double baseRate = slot.getType().equals("SUV") ? 60.0 : 40.0;
        double surgeMultiplier = occupancyRate >= 0.75 ? 1.5 : 1.0;
        double totalBill = baseRate * simulatedHours * surgeMultiplier;

        String vNo = slot.getVehicleNumber();
        String sId = slot.getSlotId();

        slot.setOccupied(false);
        slot.setVehicleNumber(null);
        slot.setEntryTime(null);
        repo.save(slot);

        String receipt = String.format("EXIT: %s (%s) | Duration: %d hrs | Surge: %.1fx | BILL: Rs. %.2f",
                vNo, sId, simulatedHours, surgeMultiplier, totalBill);
        printConsoleDashboard(receipt);
        return receipt;
    }

    private void createSlotIfMissing(String slotId, String type) {
        if (!repo.existsById(slotId)) {
            repo.save(new ParkingSlot(slotId, type));
        }
    }

    private void printConsoleDashboard(String eventLog) {
        List<ParkingSlot> all = repo.findAll();
        long occupied = repo.countByOccupiedTrue();
        double occPct = all.isEmpty() ? 0 : (occupied * 100.0) / all.size();

        StringBuilder dashboard = new StringBuilder()
            .append("\n=======================================================\n")
            .append(" EVENT : ").append(eventLog).append('\n')
            .append(String.format(" STATUS: Occupancy %.0f%% (%d/%d) | Surge Active: %s%n",
                occPct, occupied, all.size(), occPct >= 75 ? "YES (1.5x)" : "NO (1.0x)"))
            .append("-------------------------------------------------------\n");
        all.sort((first, second) -> first.getSlotId().compareTo(second.getSlotId()));
        for (ParkingSlot s : all) {
            dashboard.append(String.format(" [%s | %-7s] -> %s%n",
                s.getSlotId(), s.getType(),
                s.isOccupied() ? "OCCUPIED (" + s.getVehicleNumber() + ")" : "AVAILABLE"));
        }
        dashboard.append("=======================================================\n");
        LOGGER.info("{}", dashboard);
    }
}
