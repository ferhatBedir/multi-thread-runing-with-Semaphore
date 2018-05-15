package com.company;

public class Threads {

    SemaphoreClass semaphore = new SemaphoreClass();

    Thread thread1 = new Thread(() -> {
        try {
            semaphore.runThreads(1);
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    Thread thread2 = new Thread(() -> {
        try {
            semaphore.runThreads(2);
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    Thread thread3 = new Thread(() -> {
        try {
            Thread.sleep(7000);
            semaphore.runThreads(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    Thread thread4 = new Thread(() -> {
        try {
            Thread.sleep(2000);
            semaphore.runThreads(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    public void runthreads() throws InterruptedException {
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
    }


}
