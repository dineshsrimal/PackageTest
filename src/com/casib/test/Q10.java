package com.casib.test;

/**
 * Created by dineshs on 6/2/2019.
 */
public class Q10 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Job1());
        Thread t2 = new Thread(new Job2());

        t1.start();
        t2.start();

        for (int i = 0; i < 2; i++) {
            display(700, "Main");
        }
    }

    static void display(int delay, String message) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(message);
    }

    static class Job1 implements Runnable {

        public void run() {
            for (int i = 0; i < 3; i++) {
                display(1000, "Job1");
            }
        }
    }

    static class Job2 implements Runnable {

        public void run() {
            for (int i = 0; i < 3; i++) {
                display(400, "Job2");
            }
        }
    }
}


