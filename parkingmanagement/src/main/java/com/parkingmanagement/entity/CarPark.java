package com.parkingmanagement.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CAR_PARK")
@Data
public class CarPark extends ParkingFacility{
}
