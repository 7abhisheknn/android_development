package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give radius: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c.getPerimeter());
    }
}

