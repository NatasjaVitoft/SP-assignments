package com.company;

public class GasolineCar extends AFuelCar {

    int carFee;

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    @Override
    String getFuelType() {
        return "Gasoline";
    }


    @Override
    public int getRegistrationFee() {
        if(kmPrLitre >= 20 && kmPrLitre <= 50) {
            carFee = 330;
        }
        if(kmPrLitre >= 15 && kmPrLitre <= 20) {
            carFee = 1050;
        }
        if(kmPrLitre >= 10 && kmPrLitre <= 15) {
            carFee = 2340;
        }
        if(kmPrLitre >= 5 && kmPrLitre <= 10) {
            carFee = 5500;
        }
        if(kmPrLitre < 5) {
            carFee = 10470;
        }
        return carFee;
    }
}
