package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        System.out.println(addNumbers(100, 200));
        System.out.println(addNumbers(100.55, 200.50));
    }


    static int addNumbers(int x, int y) {
        return x + y;
    }
    static double addNumbers(double x, double y) {
        return x + y;
    }
}

class Car {
    int year;
    int speed;

    void accelerate() {
        speed += 10;
    }
    void brake() {
        speed -= 5;
    }
}