package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        byte b = 100;
        System.out.println("Byte " + b + " Max " + Byte.MAX_VALUE + " Min " + Byte.MIN_VALUE);

        short s = 7777;
        System.out.println("Short " + s + " Max " + Short.MAX_VALUE + " Min " + Short.MIN_VALUE);

        int i = 888777666;
        System.out.println("Integer " + i + " Max " + Integer.MAX_VALUE + " Min " + Integer.MIN_VALUE);

        long l = 1122334455667788L;
        System.out.println("Long " + l + " Max " + Long.MAX_VALUE + " Min " + Long.MIN_VALUE);

        float f = 3.14F;
        System.out.println("Float " + f + " Max " + Float.MAX_VALUE + " Min " + Float.MIN_VALUE);


        double d = 3.14159;
        System.out.println("Double " + f + " Max " + Double.MAX_VALUE + " Min " + Double.MIN_VALUE);


    }
}