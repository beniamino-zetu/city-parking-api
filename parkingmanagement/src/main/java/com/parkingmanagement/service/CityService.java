package com.parkingmanagement.service;

import com.parkingmanagement.entity.City;
import com.parkingmanagement.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> findAll() {
        return cityRepository.findAll();
    }


    public City save(City city) {
        return cityRepository.save(city);
    }


    public Optional<City> findById(Integer id) {
        return cityRepository.findById(id);
    }

    public Optional<City> findByCode(String code) {
        return cityRepository.findByCode(code);
    }


    public List<City> saveAll(List<City> cities) {
        return cityRepository.saveAll(cities);
    }


}
