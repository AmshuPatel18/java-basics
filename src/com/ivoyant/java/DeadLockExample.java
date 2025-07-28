package com.ivoyant.java;


class Banking {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    void methodA() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread() + "Acquired lock 1");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("exception");
        }

        synchronized (lock2) {
            System.out.println(Thread.currentThread() + " acquired lock2");
        }
    }

    void methodB() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread() + "Acquired lock 2");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("exception");
        }
        synchronized (lock1) {
            System.out.println(Thread.currentThread() + "Acquired lock 1");
        }
    }
}
        public class DeadLockExample {
            public static void main(String[] args) {


                Banking b = new Banking();
                Thread t1 = new Thread(() -> b.methodA());
                Thread t2 = new Thread(() -> b.methodB());
                t1.start();
                t2.start();
            }
        }


