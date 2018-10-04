package com.codingnomads.javafundamentals.threads;

public class PrintMyThreadRunnable implements Runnable {

    @Override
    public void run() {
        while (SynchronizedPrinter.hasMore()) {
            SynchronizedPrinter.print();
        }
    }
}
