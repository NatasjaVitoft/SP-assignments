package com.company;

public class ElectricCar extends ACar {

    int batteryCapacity;
    int maxRange;
    int kmPrLitre;
    int regFee;
    int whPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.whPrKm = getWhPrKm();
        this.kmPrLitre = this.whPrKm/91/100;

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
    public int getRegistrationFee() {
        if(kmPrLitre >= 20 && kmPrLitre <= 50) {
            regFee = 330;
        }
        if(kmPrLitre >= 15 && kmPrLitre <= 20) {
            regFee = 1050;
        }
        if(kmPrLitre >= 10 && kmPrLitre<= 15) {
            regFee = 2340;
        }
        if(kmPrLitre >= 5 && kmPrLitre<= 10) {
            regFee = 5500;
        }
        if(kmPrLitre < 5) {
            regFee = 10470;
        }
        return regFee;
    }

    public int getBatteryCapacityKWh() {
        return this.batteryCapacity;
    }

    public int getMaxRangeKm() {
        return this.maxRange;
    }

    public int getWhPrKm() {
        whPrKm = this.batteryCapacity / this.maxRange * 1000;
        return whPrKm;
    }
}
