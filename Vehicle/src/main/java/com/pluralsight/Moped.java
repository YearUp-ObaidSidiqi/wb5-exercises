package com.pluralsight;

import java.util.ArrayList;

public class Moped extends Vehicle{
    private String underSeatStorage;

    public Moped(){}

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, float maxSpeed, float currentSpeed, String underSeatStorage){
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity,  vehicleType, maxSpeed, currentSpeed);
        this.underSeatStorage = underSeatStorage;
    }

    public String getUnderSeatStorage() {
        return underSeatStorage;
    }
    public void setUnderSeatStorage(String underSeatStorage) {
        this.underSeatStorage = underSeatStorage;
    }
}