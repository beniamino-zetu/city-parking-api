package com.parkingmanagement.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BIKE")
@Data
public class Bike extends Vehicle {
}
