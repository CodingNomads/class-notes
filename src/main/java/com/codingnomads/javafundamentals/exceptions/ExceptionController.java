package com.codingnomads.javafundamentals.exceptions;

import java.util.Scanner;

public class ExceptionController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();


        int divisor = 0;
        int result = 0;
        try {
            result = 3 / divisor;
        } catch (ArithmeticException e) {
            System.out.println("cannot do operations because: " + e.getMessage());
        } finally {
            System.out.println("We finished the operation");
        }
        System.out.println("Result = " + result);

    }
}
