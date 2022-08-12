package com.parkingmanagement.repository;

import com.parkingmanagement.entity.ParkingFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingFacilityRepository extends JpaRepository<ParkingFacility, String> {
    @Query(value = "select * from PARKING_FACILITIES where city_id like (SELECT id from cities where name = :cityName)", nativeQuery = true)
    List<ParkingFacility> findAllByCity(@Param("cityName") String cityName);
}
