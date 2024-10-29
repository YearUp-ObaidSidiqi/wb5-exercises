package com.pluralsight;

public class Car extends Vehicle{
    private String trunkContent;
    private String rearviewMirror;


    public Car(){}

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, float maxSpeed, float currentSpeed, String trunkContent, String rearviewMirror) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, vehicleType, maxSpeed, currentSpeed);
        this.trunkContent = trunkContent;
        this.rearviewMirror = rearviewMirror;
    }

    public String getTrunkContent() {
        return trunkContent;
    }
    public void setTrunkContent(String trunkContent) {
        this.trunkContent = trunkContent;
    }
    public String getRearviewMirror() {
        return rearviewMirror;
    }
    public void setRearviewMirror(String rearviewMirror) {
        this.rearviewMirror = rearviewMirror;
    }
}