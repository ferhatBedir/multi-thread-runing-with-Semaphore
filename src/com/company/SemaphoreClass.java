package com.company;

import java.util.concurrent.Semaphore;

public class SemaphoreClass {

    private Semaphore semaphore = new Semaphore(2);

    public void runThreads(int id) throws InterruptedException {

        semaphore.acquire();
        System.out.println(id + "'inci Thread işleme başlayacak.");
        Thread.sleep(3000);
        for (int i = 0; i < 3; i++) {
            System.out.println(id + "inci Thread işlemi yapıyor.");
            Thread.sleep(500);
            System.out.println(id + "inci Thread işlemi yapmaya devam ediyor.");
            Thread.sleep(500);
            System.out.println(id + "inci Thread işlemi tamamladı.");
            Thread.sleep(500);
        }
        System.out.println(id + "'inci Thread işlemi tamamladı.");
        semaphore.release();
        Thread.sleep(2500);
        System.out.println(id + "'inci thread işlemi terk etti.");
    }
}
