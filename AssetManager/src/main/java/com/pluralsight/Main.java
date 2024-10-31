package com.pluralsight;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        var asset = new ArrayList<Asset>();
        //asset.add(new Home("Main House", "2022-12-11", 300000, "The Forest", 1,30000, 10000));
        asset.add(new Vehicle("yellow car", "May 8", 1000.00, "toyota", "supra",2022, 500));
       // asset.add(new Home("Vacation House", "2022-12-11", 300000, "The Forest", 1,30000, 10000));
        asset.add(new Vehicle("blue car", "May 12", 95000, "aston martin","dbs",2023, 4300));

        for (Asset asset1: asset){
        System.out.println(asset1);
        }

        String message = "";
        if (asset.get(i) instanceof Home) {
            Home home = (Home) asset.get(i);
            message = "House at " + home.getAddress();
        }
        else if (asset.get(i) instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) asset.get(i);
            message = "Vehicle: " +
                    vehicle.getYear() + " " + vehicle.getMake();
        }
    }
}