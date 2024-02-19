package com.example.lib;
import com.example.lib.Car;
public class MyClass {

    public static void main(String[] args) {
        Car myCar = new Car("C300");
        myCar.start();
        myCar.honk();
        myCar.stop();
    }
}

