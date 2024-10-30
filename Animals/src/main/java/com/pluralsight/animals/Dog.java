package com.pluralsight.animals;

import com.pluralsight.Animal;

public class Dog extends Animal {


    public void sayHello(){
        bark();
    }

    public Dog(String name){

        System.out.println("TRACE -- from dog constructor");
        super.setSpecies("Dog");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private String breed;

    public void bark(){
        if(super.getWeight() < 50){
            System.out.println("BARK");
        }
        else{
            System.out.println("WOOF");
        }
    }


}