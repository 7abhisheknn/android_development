package com.example.lib;
import com.example.lib.Car;
public class MyClass {

    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        bmw.startEngine();
        bmw.accelerate();
        bmw.brake();
        bmw.stopEngine();

        Truck t1 = new Truck(6);
        t1.getType();
        t1.startEngine();
        t1.start();
        t1.accelerate();
        t1.brake();
        t1.stop();
        t1.stopEngine();
    }
}

