package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        //Arithemetic Operators + - * / %
        System.out.println(10+3); // 13
        System.out.println(10-3); // 7
        System.out.println(10*3); // 30
        System.out.println(10/3); // 3
        System.out.println(10%3); // 1

        // Comparision Operators: == != > < >= <=
        System.out.println(10 == 10); // true
        System.out.println(11 == 10); // false

        System.out.println(10 != 10); // false
        System.out.println(11 != 10); // true

        System.out.println(10 > 10); // false
        System.out.println(11 > 10); // true

        System.out.println(10 < 10); // false
        System.out.println(10 < 11); // true

        System.out.println(9 >= 10); // false
        System.out.println(11 >= 10); // true

        System.out.println(10 <= 10); // true
        System.out.println(11 <= 10); // false

        // Logical Operators: && || !
        System.out.println(true && false); // false
        System.out.println(true || false); // true
        System.out.println(!true); // false

    }
}