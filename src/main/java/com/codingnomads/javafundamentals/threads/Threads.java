package com.codingnomads.javafundamentals.threads;

public class Threads {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread());
        Thread thread1 = new Thread(new PrintMyThreadRunnable(), "Thread 1");
        Thread thread2 = new Thread(new PrintMyThreadRunnable(), "Thread 2");
        Thread thread3 = new Thread(new PrintMyThreadRunnable(), "Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();


    }


}
