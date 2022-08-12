package com.parkingmanagement.controller;

import com.parkingmanagement.entity.ParkingFacility;
import com.parkingmanagement.service.ParkingFacilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping(ParkingFacilityController.BASE_URL)
@RestController
public class ParkingFacilityController {

    public static final String BASE_URL = "/api/v1/facilities";

    @Autowired
    private final ParkingFacilityService parkingFacilityService;

    @GetMapping("/all/{cityName}")
    List<ParkingFacility> allByCity(@PathVariable String cityName) {
        return parkingFacilityService.findAllByCity(cityName);
    }

    @GetMapping("/{id}")
    Optional<ParkingFacility> getOneById(@PathVariable String id ) {
        return parkingFacilityService.findById(id);
    }
    @PostMapping
    ParkingFacility newParkingFacility(@RequestBody ParkingFacility parkingFacility) {
        return parkingFacilityService.save(parkingFacility);
    }
}
