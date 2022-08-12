package com.parkingmanagement.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BIKE_PARK")
@Data
public class BikeRack extends ParkingFacility{
}
