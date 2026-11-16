package com.parking.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SlotRepository extends JpaRepository<ParkingSlot, String> {
    List<ParkingSlot> findByTypeAndOccupiedFalseOrderBySlotIdAsc(String type);
    boolean existsByVehicleNumber(String vehicleNumber);
    long countByOccupiedTrue();
}