package org.example;

public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, String model, int year, boolean hasSideCar) throws InvalidYearException {
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar (){
        return hasSideCar;
    }

    @Override
    public String vehicleSound (){
        return "NGEEEEENNGGGG!!!!";
    }
}
