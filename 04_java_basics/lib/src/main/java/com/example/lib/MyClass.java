package com.example.lib;


import com.sun.org.apache.xpath.internal.operations.Neg;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }
    public static String reverse(String s) {
        return (new StringBuilder(s)).reverse().toString();
    }
}

