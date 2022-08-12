package com.parkingmanagement.entity;

public class ParkingFacilityFullException extends Exception{
    public ParkingFacilityFullException(String errorMessage){
        super(errorMessage);
    }
}
