package com.example.lib;


import com.sun.org.apache.xpath.internal.operations.Neg;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.print((arr1[i] * arr2[i]) + " ");
        }
    }

}

