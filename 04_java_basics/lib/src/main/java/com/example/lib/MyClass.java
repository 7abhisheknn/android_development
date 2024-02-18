package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        // Continue and break
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) continue;
            if (i == 7) break;
            System.out.println(i);
        }
    }
}