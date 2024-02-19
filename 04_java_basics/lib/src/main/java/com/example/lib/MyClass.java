package com.example.lib;


import com.sun.org.apache.xpath.internal.operations.Neg;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println("Avg: " + (float)sum/n);

    }

}

