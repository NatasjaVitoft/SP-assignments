package com.company;

public abstract class ACar implements Car {

    public String registrationNumber;
    public String make;
    public String model;
    public int numberOfDoors;

    public ACar (String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    @Override
    public String toString() {
        return "Reg Number: "+ registrationNumber + " Make: " + make + " Model: " + model + " Doors: " + numberOfDoors + "\n";
    }
}
