package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }


    public void chooseVehicle() {
        System.out.println("Welcome to vehicle");
        System.out.println("Choose your vehicle");
        System.out.println("1. Car");
        System.out.println("2. Motorcylcle");
        System.out.println("3. Exit\n");
    }

    public void setVehicle(int choice) {
        switch (choice) {
            case 1:
                try {
                    System.out.println("Input car brand: ");
                    String carBrand = scanner.next();
                    System.out.println("Input car model: ");
                    String carModel = scanner.next();
                    System.out.println("Input car year: ");
                    int carYear = scanner.nextInt();
                    System.out.println("Input car number of doors: ");
                    int carNumOfDoors = scanner.nextInt();

                    Car car = new Car(carBrand, carModel, carYear, carNumOfDoors);
                    System.out.println("Car sound: " + car.vehicleSound());
                } catch (InvalidYearException message) {
                    System.out.println(message.getMessage());
                }
            case 2:
                try {
                    System.out.println("Input motorcycle brand: ");
                    String motorcycleBrand = scanner.next();
                    System.out.println("Input Motorcycle model: ");
                    String motorcycleModel = scanner.next();
                    System.out.println("Input motorcycle year: ");
                    int motorcycleYear = scanner.nextInt();
                    System.out.println("Have a sidecar ? (True || False): ");
                    boolean motorcycleHasSidecar = scanner.nextBoolean();

                    Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleModel, motorcycleYear, motorcycleHasSidecar);
                    System.out.println("Motorcycle sound: " + motorcycle.vehicleSound());
                } catch (InvalidYearException message) {
                    System.out.println(message.getMessage());
                }
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public void run() {
        while (true) {
            chooseVehicle();
            System.out.print("Input your vehicle: ");
            int choice = scanner.nextInt();
            setVehicle(choice);
        }
    }
}