package com.parkingmanagement.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLES")
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING)
public class Vehicle {

    @Id
    private String id;

    @OneToOne
    @JoinColumn(name = "CITY_ID")
    private City city;

    @Column
    private Boolean isParked;


    @OneToOne
    @JoinColumn(name = "PARKING_FACILITY_ID")
    private ParkingFacility parkingFacility;


}
