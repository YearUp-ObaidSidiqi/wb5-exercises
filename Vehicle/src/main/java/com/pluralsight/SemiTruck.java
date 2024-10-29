package com.pluralsight;

public class SemiTruck extends Vehicle{
    private int maxLoadCapacity;
    private int currentLoadCapacity;


    public SemiTruck(){}

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, float maxSpeed, float currentSpeed, int maxLoadCapacity, int currentLoadCapacity){
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, vehicleType, maxSpeed, currentSpeed);
        this.maxLoadCapacity = maxLoadCapacity;
        this.currentLoadCapacity = currentLoadCapacity;

    }
    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }
    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }
    public int getCurrentLoadCapacity() {
        return currentLoadCapacity;
    }
    public void setCurrentLoadCapacity(int currentLoadCapacity) {
        this.currentLoadCapacity = currentLoadCapacity;
    }
}