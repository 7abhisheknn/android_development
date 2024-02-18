package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        Car redCar = new Car();
        redCar.year = 2023;
        redCar.speed = 180;
        redCar.accelerate();
        redCar.accelerate();
        redCar.brake();
        System.out.println(redCar);
    }
}

class Car {
    int year;
    int speed;

    void accelerate() {
        speed += 10;
        System.out.println("Your new speed: " + speed);
    }
    void brake() {
        speed -= 5;
        System.out.println("Your new speed: " + speed);
    }
}