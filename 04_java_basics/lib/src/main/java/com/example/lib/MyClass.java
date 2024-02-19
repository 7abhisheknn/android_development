package com.example.lib;
public class MyClass {

    public static void main(String[] args) {
        Circle c = new Circle (5.0);
        Rectangle r = new Rectangle(4.0, 6.0);
        System.out.println(c.calcualteArea());
        System.out.println(c.calculatePerimeter());
        System.out.println(r.calcualteArea());
        System.out.println(r.calculatePerimeter());
    }
}

