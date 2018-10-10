package com.codingnomads.javafundamentals.methodreference;

import com.codingnomads.javafundamentals.anonymousclassses.MyRestingRunnable;

import java.util.function.Consumer;

public class MethodReferenceController {
    public static void main(String[] args) {
        Consumer<String> staticMethodReference = System.out::println;

        Thread myThread = new Thread(MethodReferenceController::anyName);

        MyRestingRunnable myRestingRunnable = new MyRestingRunnable();
        Thread myThread2 = new Thread(myRestingRunnable::run);

        myThread.start();
        myThread2.start();
    }

    public static void anyName() {
        System.out.println("Im running");
    }

}
