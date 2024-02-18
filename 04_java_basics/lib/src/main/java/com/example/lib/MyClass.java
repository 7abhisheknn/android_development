package com.example.lib;

public class MyClass {

    public static void main(String[] args) {

        sayHello();
        System.out.println(addNumbers(100, 200));
    }

    static void sayHello() {
        System.out.println("Hello world from method");
    }


    static int addNumbers(int x, int y) {
        return x + y;
    }
}