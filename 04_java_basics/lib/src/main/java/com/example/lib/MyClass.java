package com.example.lib;
import com.example.lib.Car;
public class MyClass {

    public static void main(String[] args) {
        Vehicle v1 = new Car("BMW");
        Vehicle v2 = new Truck(6);
        v1.start();
        v2.start();
        v1.brake();
        v2.brake();
    }
}

