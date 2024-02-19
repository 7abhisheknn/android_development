package com.example.lib;

public class Car implements VehicleInterface{
    String carModel;
    public Car(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public void startEngine() {
        System.out.println("Car: Engine Start");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car: Engine Stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Car: Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Car: brake");
    }
}
