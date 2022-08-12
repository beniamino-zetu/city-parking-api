package com.parkingmanagement.repository;

import com.parkingmanagement.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

    @Query(value = "SELECT * FROM VEHICLES WHERE CITY_ID = (SELECT ID FROM CITIES WHERE CITY_CODE = :cityCode)", nativeQuery = true)
    List<Vehicle> findAllByCityCode(@Param("cityCode") String cityCode);
}
