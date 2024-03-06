package org.example;
import java.time.Year;

class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) throws InvalidYearException{
        if (year > Year.now().getValue()){
            throw new InvalidYearException("Is next Year");
        }
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String vehicleSound () {
        return "Not Sound Found!";
    }


}
