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

class Car {
    int year;
    int speed;

    public Car(int year, int speed) {
        this.year = year;
        this.speed = speed;
    }

    void accelerate() {
        speed += 10;
        System.out.println("Your new speed: " + speed);
    }
    void brake() {
        speed -= 5;
        System.out.println("Your new speed: " + speed);
    }
}