package com.codingnomads.javafundamentals.anonymousclassses;

public class AnonymousController {

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyWorkingRunnable());
        Thread myThread2 = new Thread(new MyRestingRunnable());
        Thread myThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Im jumping");
            }
        });

        Thread myThread4 = new Thread(() -> System.out.println("Im crouching"));

        myThread.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
    }

}
