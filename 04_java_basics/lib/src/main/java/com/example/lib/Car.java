package com.example.lib;

public class Car extends Vehicle{
    String carModel;
    public Car(String carModel) {
        super(4);
        this.carModel = carModel;
    }

    void honk() {
        System.out.println("Beep! Beep!");
    }

    @Override
    void start() {
        System.out.println("The Car Starts");
    }

    @Override
    void brake() {
        System.out.println("Applying mechanical break");
    }
}
