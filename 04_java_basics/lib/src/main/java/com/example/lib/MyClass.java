package com.example.lib;


public class MyClass {

    public static void main(String[] args) {
        int n = 6;
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int rem = n % 2;
            n /= 2;
            sb.append(rem);
        }
        System.out.println(sb.reverse());
    }
}

