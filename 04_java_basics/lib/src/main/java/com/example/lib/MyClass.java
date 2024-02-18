package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        Car redCar = new Car(2023, 180);
        redCar.accelerate();
        redCar.accelerate();
        redCar.brake();
        System.out.println(redCar);
    }
}

