package com.parkingmanagement.repository;

import com.parkingmanagement.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Integer> {
    @Query(value = "SELECT * FROM cities where code = :code", nativeQuery = true)
    Optional<City> findByCode(@Param("code") String code);
}
