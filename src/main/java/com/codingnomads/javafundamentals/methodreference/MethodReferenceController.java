package com.codingnomads.javafundamentals.methodreference;

import com.codingnomads.javafundamentals.anonymousclassses.MyRestingRunnable;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceController {
    public static void main(String[] args) {
        Consumer<String> lambda = s -> System.out.println(s);
        Consumer<String> methodReference = System.out::println;

        MyRestingRunnable myRestingRunnable = new MyRestingRunnable();
        Thread myThread = new Thread(MethodReferenceController::run);
        Thread myThread2 = new Thread(myRestingRunnable::run);

        myThread.start();
        myThread2.start();

        Function<String, Integer> intCreator = string -> new Integer(string);
        Integer integer = intCreator.apply("2");

    }
    public static void run() {
        System.out.println("Im running");
    }

}
