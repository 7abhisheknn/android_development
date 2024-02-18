package com.example.lib;

public class MyClass {

    public static void main(String[] args) {

        sayHello();
        System.out.println(addNumbers());
    }

    static void sayHello() {
        System.out.println("Hello world from method");
    }

    static int addNumbers() {
        int x = 10;
        int y = 20;

        int z = x + y;
        return z;
    }
}