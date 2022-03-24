package com.company;

public class Main {

    public static void main(String[] args) {

        FleetOfCars fleetOfCars = new FleetOfCars();

        GasolineCar gasolineCar1 = new GasolineCar("ABC", "FORD", "New model", 4,22);
        DieselCar dieselCar1 = new DieselCar("BBB", "FIAT", "Old", 4, 13, true);
        ElectricCar electricCar1 = new ElectricCar("AAA", "Ferrari", "New model", 4, 20000, 100);
        GasolineCar gasolineCar2 = new GasolineCar("CCC", "Tesla", "New model", 2, 42);
        ElectricCar electricCar2 = new ElectricCar("NNN", "Toyota", "Old model", 6, 22000, 150);

        // prints registrationfee:
        System.out.println("RegistrationFee for gasolineCar1: " + gasolineCar1.getRegistrationFee());
        System.out.println("RegistrationFee for dieselCar1: " +dieselCar1.getRegistrationFee());
        System.out.println("RegistrationFee for electricCar1: " +electricCar1.getRegistrationFee());

        //print other features of the car:
        System.out.println("dieselCar1 fueltype: " + dieselCar1.getFuelType());
        System.out.println("gasolineCar1 fueltype: " + gasolineCar1.getFuelType());


        //adds cars to fleet of cars:
        fleetOfCars.addCar(gasolineCar1);
        fleetOfCars.addCar(dieselCar1);
        fleetOfCars.addCar(electricCar1);
        fleetOfCars.addCar(gasolineCar2);
        fleetOfCars.addCar(electricCar2);

        //prints the fleet of cars + total registrationfee:
        fleetOfCars.getTotalRegistrationFeeForFleet();
        System.out.println("All cars in the fleet: " + "\n" + fleetOfCars);

    }
}
