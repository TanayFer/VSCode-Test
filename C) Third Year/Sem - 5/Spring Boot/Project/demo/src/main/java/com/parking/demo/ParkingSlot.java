package com.parking.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ParkingSlot {

    @Id
    private String slotId; // "C-01", "S-01"
    private String type;   // "SUV"
    private boolean occupied;
    private String vehicleNumber;
    private LocalDateTime entryTime;

    public ParkingSlot() {}

    public ParkingSlot(String slotId, String type) {
        this.slotId = slotId;
        this.type = type;
        this.occupied = false;
    }

    public String getSlotId() { return slotId; }
    public void setSlotId(String slotId) { this.slotId = slotId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public boolean isOccupied() { return occupied; }
    public void setOccupied(boolean occupied) { this.occupied = occupied; }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public LocalDateTime getEntryTime() { return entryTime; }
    public void setEntryTime(LocalDateTime entryTime) { this.entryTime = entryTime; }
}