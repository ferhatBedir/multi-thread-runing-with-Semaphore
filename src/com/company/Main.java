package com.company;

public class Main {

    public static void main(String[] args) {
        Threads threads = new Threads();

        try {
            threads.runthreads();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
