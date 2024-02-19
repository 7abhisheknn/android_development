package com.example.lib;


import com.sun.org.apache.xpath.internal.operations.Neg;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x%2 == 0) ++even;
            else ++odd;
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
    }

}

