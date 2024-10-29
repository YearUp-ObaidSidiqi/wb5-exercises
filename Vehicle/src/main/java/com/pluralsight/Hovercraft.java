package com.pluralsight;

public class Hovercraft extends Vehicle{
    private boolean onWater;
    private float hoverHeight;
    private boolean electric;

    public Hovercraft(){}

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, float maxSpeed, float currentSpeed, boolean onWater, float hoverHeight, boolean electric){
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, vehicleType, maxSpeed, currentSpeed);
        this.onWater = onWater;
        this.hoverHeight = hoverHeight;
        this.electric = electric;
    }

    public boolean isElectric() {
        return electric;
    }
    public void setElectric(boolean electric) {
        this.electric = electric;
    }
    public boolean isOnWater() {
        return onWater;
    }
    public void setOnWater(boolean onWater) {
        this.onWater = onWater;
    }
    public float getHoverHeight() {
        return hoverHeight;
    }
    public void setHoverHeight(float hoverHeight) {
        this.hoverHeight = hoverHeight;
    }
}