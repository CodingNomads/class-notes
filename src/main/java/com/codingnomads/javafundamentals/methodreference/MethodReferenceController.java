package com.codingnomads.javafundamentals.methodreference;

import com.codingnomads.javafundamentals.anonymousclassses.MyRestingRunnable;

import java.util.function.Consumer;

public class MethodReferenceController {
    public static void main(String[] args) {
        Consumer<String> methodReference = System.out::println;

        MyRestingRunnable myRestingRunnable = new MyRestingRunnable();
        Thread myThread = new Thread(MethodReferenceController::run);
        Thread myThread2 = new Thread(myRestingRunnable::run);

        myThread.start();
        myThread2.start();
    }

    public static void run() {
        System.out.println("Im running");
    }

}
