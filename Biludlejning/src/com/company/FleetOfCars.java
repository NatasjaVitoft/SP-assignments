package com.company;

import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void getTotalRegistrationFeeForFleet() {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getRegistrationFee();
        }
        System.out.println ("Total registrationFee for all cars: " + sum);
    }

    @Override
    public String toString() {
        String result = "";
        for (Car car : cars) {
            result+=car.toString();
        }
        return result;
    }
}
