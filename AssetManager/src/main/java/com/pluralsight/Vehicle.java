package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String make;
    private String model;
    private int year;
    private int odometer;

    public Vehicle(){

    }
    public Vehicle(String description, String dataAcquired, double originalCost, String make, String model, int year, int odometer) {
        super(description, dataAcquired, originalCost);
        this.make = make;
        this.model = model;
        this.year = year;
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getOdometer() {
        return odometer;
    }
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double getValue(){
        int differencesYear =  LocalDate.now().getYear()-year;
        double originalCost = super.getOriginalCost();
        System.out.println(differencesYear);
        double value=0;
        /// WOP
        if (differencesYear >= 1 && differencesYear <= 3) {

            originalCost*=Math.pow(0.97,differencesYear);

        } else if (differencesYear >= 4 && differencesYear <= 6) {
            originalCost = originalCost * 0.06 * differencesYear;
        } else if (differencesYear >= 7 && differencesYear <= 10) {
            originalCost = originalCost * 0.08 * differencesYear;
        } else if (differencesYear > 10) {
            originalCost = 10000;
        }

        if (getOdometer() >= 100000
            && getMake().equalsIgnoreCase("Honda")
            && getMake().equalsIgnoreCase("Toyota")){
            originalCost -= originalCost * 0.25;
        }

        return originalCost;
    }
    @Override
    public String toString() {
        return "Vehicle      {" +
                "Description = '" + getDescription() + '\'' +
                ", Date Acquired = '" + getDateAcquired() + '\'' +
                ", Original Cost = $" + getOriginalCost() +
                ", Make = '" + make + '\'' +
                ", Model = '" + model + '\'' +
                ", Year = " + year +
                ", Odometer = " + odometer + " miles" +
                ", Current Value = $" + getValue() +
                '}';
    }

}
