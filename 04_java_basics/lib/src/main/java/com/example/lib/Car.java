package com.example.lib;

public class Car {
    private int year;
    private int speed;

    public Car(int year, int speed) {
        this.year = year;
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
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