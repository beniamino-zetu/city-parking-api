package com.parkingmanagement.controller;

import com.parkingmanagement.entity.Vehicle;
import com.parkingmanagement.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping(VehicleController.BASE_URL)
@RestController
public class VehicleController {

    public static final String BASE_URL = "/api/v1/vehicles";

    private final VehicleService vehicleService;

    @GetMapping("/all/{cityCode}")
    List<Vehicle> allByCityCode(@PathVariable String cityCode) {
        return vehicleService.findAllByCityCode(cityCode);
    }

    @PostMapping
    Vehicle newParkingFacility(@RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @PutMapping("/{id}")
    Vehicle updateVehicle ( @RequestBody Vehicle vehicle, @PathVariable String id )
    {
        return vehicleService.update(vehicle, id);
    }

}
