package com.example.lib;

public class Truck extends Vehicle implements VehicleInterface{
    public Truck(int numberOfWheels) {
        super(numberOfWheels);
    }
    @Override
    void getType() {
        super.getType();
        System.out.println("Truck Sub Type");
    }
    @Override
    public void startEngine() {
        System.out.println("Vehicle: Engine Start");
    }

    @Override
    public void stopEngine() {
        System.out.println("Vehicle: Engine Stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Vehicle: Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Vehicle: brake");
    }
}
