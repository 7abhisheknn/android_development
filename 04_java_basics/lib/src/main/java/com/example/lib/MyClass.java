package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        // Type Casting: is the process of converting
        // a value from one data type to another

        // Implicit Type Casting
        int numInt = 10;
        double numDouble = numInt;
        System.out.println(numInt);
        System.out.println(numDouble);

        // Explicit Type Casting
        double pi = 3.14;
        int numPi = (int)pi;
        System.out.println(pi);
        System.out.println(numPi);

        // Type Casting between different Data Types
        int myInt = 5;
        char myChar = (char)(myInt + 'A');
        System.out.println(myChar);
    }
}