package com.example.lib;


import com.sun.org.apache.xpath.internal.operations.Neg;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int upper = 0;
        int lower = 0;
        int number = 0;
        int space = 0;
        int special = 0;
        char[] charArr = s.toCharArray();
        for(char c: charArr) {
            switch (Character.getType(c)) {
                case Character.UPPERCASE_LETTER:
                    ++upper;
                    break;
                case Character.LOWERCASE_LETTER:
                    ++lower;
                    break;
                case Character.DECIMAL_DIGIT_NUMBER:
                    ++number;
                    break;
                case Character.SPACE_SEPARATOR:
                    ++space;
                    break;
                default:
                    ++special;
                    break;
            }
        }
        System.out.println("upper case: " + upper);
        System.out.println("lower case: " + lower);
        System.out.println("    number: " + number);
        System.out.println("     space: " + space);
        System.out.println("   special: " + special);
    }
}

