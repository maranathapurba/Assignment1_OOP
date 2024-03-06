package org.example;

public class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, String model, int year, int numOfDoors) throws InvalidYearException {
        super(brand, model, year);
        this.numOfDoors = numOfDoors;
    }

    public int getNumbOfDoors (){
        return numOfDoors;
    }

    @Override
    public String vehicleSound (){
        return "NGIIIIIIIIING!!!!";
    }
}
