package com.example.lib;

public abstract class Vehicle {
    int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    void start() {
        System.out.println("The Vehicle Starts");
    }
    void stop() {
        System.out.println("The Vehicle Stops");
    }
    abstract void brake();
}
