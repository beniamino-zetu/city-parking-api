package com.parkingmanagement.service;

import com.parkingmanagement.entity.ParkingFacilityFullException;
import com.parkingmanagement.entity.Vehicle;
import com.parkingmanagement.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> findAllByCityCode(String cityCode) {
        return vehicleRepository.findAllByCityCode(cityCode);
    }

    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle update(Vehicle newVehicle, String id) {
        return vehicleRepository.findById(id).map(vehicle -> {
            vehicle.setIsParked(newVehicle.getIsParked());
            try {
                vehicle.getParkingFacility().setAvailableCapacity(vehicle.getParkingFacility().getAvailableCapacity() - 1);
            } catch (ParkingFacilityFullException e) {
                throw new RuntimeException(e);
            }
            return vehicleRepository.save(vehicle);
        }).orElseGet(() -> vehicleRepository.save(newVehicle));
    }
}
