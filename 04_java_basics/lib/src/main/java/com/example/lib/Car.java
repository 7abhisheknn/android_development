package com.example.lib;

public class Car extends Vehicle{
    String carModel;
    public Car(String carModel) {
        super(4);
        this.carModel = carModel;
    }
}
