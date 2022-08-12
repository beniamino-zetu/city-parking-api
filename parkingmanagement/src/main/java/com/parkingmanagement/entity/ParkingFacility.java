package com.parkingmanagement.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "PARKING_FACILITIES")
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING)
public class ParkingFacility {

    @Id
    private String id;

    @Column
    @Size(max = 256)
    private String name;

    @JoinColumn(name = "CITY_ID")
    @OneToOne
    private City city;

    @Column
    private Integer capacity;

    @Column
    private Integer availableCapacity;


    public void setAvailableCapacity(Integer availableCapacity) throws ParkingFacilityFullException {
        if(availableCapacity>=0)
        this.availableCapacity = availableCapacity;
        else
            throw new ParkingFacilityFullException("Parking facility is full");
    }
}
