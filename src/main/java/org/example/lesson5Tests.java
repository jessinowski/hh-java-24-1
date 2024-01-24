package org.example;

public class lesson5Tests {
    public static void main(String[] args) {
    }

    // Write a test for a method that calculates the sum of two integers.
    public static int add(int a, int b) {
        return a + b;
    }

    // Write a test for a method that checks if a given number is even.
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    // Write a test for a method that calculates the product of two integers.
    public static int multiply(int a, int b){
        return a*b;
    }

    // Write a test for a method that converts a given string to uppercase.
    public static String uppercaseString(String string){
        return string.toUpperCase();
    }

    // Write a test for a method that checks if a given number is positive.
    public static boolean isPositive(int a){
        return a >=0;
    }
}
