package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(){

    }
    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }
    public Vehicle(String description, String dataAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dataAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
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

    @Override
    public double getValue(){
       int x = (year-LocalDate.now().getYear());
       double i=0;
       if (x>=0 && x<=3){
           i = (super.getOriginalCost()*0.03)*x;
       }if (x>=4 && x<=6){
            i = (super.getOriginalCost()*0.06)*x;
        }if (x>=7 && x<=10){
            i = (super.getOriginalCost()*0.08)*x;
        }if (x>=10){
            i = (super.getOriginalCost()*0.08)*x;
        }


       return i;
    }
}
