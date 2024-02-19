package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        int a = sc.nextInt();
        System.out.println("Give another number: ");
        int b = sc.nextInt();
        System.out.println((float)a/b);
        System.out.println(a%b);
    }
}

