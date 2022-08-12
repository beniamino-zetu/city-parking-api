package com.parkingmanagement.controller;

import com.parkingmanagement.entity.City;
import com.parkingmanagement.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping(CityController.BASE_URL)
@RestController
public class CityController {

    public static final String BASE_URL = "/api/v1/cities";

    @Autowired
    private final CityService cityService;


    @GetMapping
    List<City> all() {
        return cityService.findAll();
    }

    @PostMapping
    City newCity(@RequestBody City city) {
        return cityService.save(city);
    }

    @GetMapping("/id/{id}")
    Optional<City> oneById(@PathVariable Integer id) {
        return cityService.findById(id);
    }

    @GetMapping("/code/{code}")
    Optional<City> oneByCode(@PathVariable String code) {
        return cityService.findByCode(code);
    }
}
