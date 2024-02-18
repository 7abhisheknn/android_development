package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        // Switch Statement:

        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}