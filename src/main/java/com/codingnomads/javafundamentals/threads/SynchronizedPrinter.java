package com.codingnomads.javafundamentals.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedPrinter {

    public static int number = 10;
    private static Lock lock = new ReentrantLock();

    public SynchronizedPrinter() {
    }

    synchronized static public void print() {
        int number = getNumber();
        System.out.println(Thread.currentThread().getName() + " " + number);
        decreaseNumber();


        int d =  new Integer(2);
    }

    public static boolean hasMore() {
        return number > 0;
    }

    private static int getNumber() {
        return number;
    }

    private static void decreaseNumber() {
        number--;
    }
}
