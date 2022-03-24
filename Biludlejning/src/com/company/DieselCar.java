package com.company;

public class DieselCar extends AFuelCar {

     int carFee;
     int carFee2;
     boolean particleFilter;
     int filterFee;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
        this.particleFilter = particleFilter;
    }


    public boolean hasParticleFilter() {
        return particleFilter;
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

        if(kmPrLitre >= 20 && kmPrLitre <= 50) {
            carFee2 = 130;
        }
        if(kmPrLitre >= 15 && kmPrLitre <= 20) {
            carFee2 = 1390;
        }
        if(kmPrLitre >= 10 && kmPrLitre <= 15) {
            carFee2 = 1850;
        }
        if(kmPrLitre >= 5 && kmPrLitre <= 10) {
            carFee2 = 2770;
        }
        if(kmPrLitre < 5) {
            carFee2 = 15260;
        }

        if(particleFilter) {
            filterFee = 0;
        }

        if(!particleFilter) {
            filterFee = 1000;
        }
        return carFee+carFee2+filterFee;
    }

    @Override
    String getFuelType() {
        return "Diesel";
    }
}
