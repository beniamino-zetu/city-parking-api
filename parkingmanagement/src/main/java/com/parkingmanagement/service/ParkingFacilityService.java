package com.parkingmanagement.service;

import com.parkingmanagement.entity.ParkingFacility;
import com.parkingmanagement.repository.ParkingFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParkingFacilityService {

    @Autowired
    private ParkingFacilityRepository parkingFacilityRepository;

    public List<ParkingFacility> findAllByCity(String cityName) {
        return parkingFacilityRepository.findAllByCity(cityName);
    }

    public Optional<ParkingFacility> findById(String id) {
        return parkingFacilityRepository.findById(id);
    }

    public ParkingFacility save(ParkingFacility parkingFacility) {
        return parkingFacilityRepository.save(parkingFacility);
    }
}
