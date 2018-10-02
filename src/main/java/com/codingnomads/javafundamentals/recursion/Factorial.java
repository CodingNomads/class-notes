package com.codingnomads.javafundamentals.recursion;

/**
 * Write a method that calculates the factorial of a number using recursion
 */

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
