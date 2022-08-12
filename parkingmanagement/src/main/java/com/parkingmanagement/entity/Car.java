package com.parkingmanagement.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CAR")
@Data
public class Car extends Vehicle {
}
