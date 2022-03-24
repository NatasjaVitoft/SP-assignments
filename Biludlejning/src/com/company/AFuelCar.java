package com.company;

public abstract class AFuelCar extends ACar {

    public int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
    }

    public abstract int getRegistrationFee();

    abstract String getFuelType();

    public int kmPrLitre() {
        return this.kmPrLitre;
    }

    @Override
    public String toString() {
        return  "Reg number: " + registrationNumber + " Make: " + make + " Model: " + model + " Doors: " + numberOfDoors + " KmPrLitre: " + kmPrLitre + "\n";
    }
}
