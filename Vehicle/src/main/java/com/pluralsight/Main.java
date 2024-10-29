package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Moped mop = new Moped();
        mop.setColor("Red");
        mop.setFuelCapacity(15);
        mop.setCargoCapacity(4);
        mop.setNumberOfPassengers(2);

        Car car = new Car();
        car.setColor("white");
        car.setFuelCapacity(27);
        car.setCargoCapacity(2);
        car.setNumberOfPassengers(2);

        Hovercraft hover1 = new Hovercraft();
        hover1.setColor("blue");
        hover1.setFuelCapacity(40);
        hover1.setCargoCapacity(2);
        hover1.setNumberOfPassengers(4);

        SemiTruck Kenworth = new SemiTruck();
        Kenworth.setColor("orange");
        Kenworth.setFuelCapacity(100);

        Moped moped = new Moped();


    }
}