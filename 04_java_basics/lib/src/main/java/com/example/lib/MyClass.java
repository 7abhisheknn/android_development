package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        int[] numbersArray = new int[5];

        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;
        numbersArray[3] = 40;
        numbersArray[4] = 50;

        for(int num: numbersArray) {
            System.out.println(num);
        }
    }
}