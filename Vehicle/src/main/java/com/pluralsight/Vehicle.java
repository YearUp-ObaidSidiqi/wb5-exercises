package com.pluralsight;

public class Vehicle {

    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private String vehicleType;
    private float maxSpeed;

    public Vehicle(){}
    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, float maxSpeed, float currentSpeed) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.vehicleType = vehicleType;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(float currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    public float getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    private float currentSpeed;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    public int getFuelCapacity() {
        return fuelCapacity;
    }
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}