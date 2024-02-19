package com.example.lib;

public class Truck extends Vehicle{
    public Truck(int numberOfWheels) {
        super(numberOfWheels);
    }

    @Override
    void start() {
        System.out.println("The Truck Starts");
    }

    @Override
    void brake() {
        System.out.println("Applying hydraulic break");
    }
}
