package com.example.lib;

public class Car {
    private int year;
    protected int speed;

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