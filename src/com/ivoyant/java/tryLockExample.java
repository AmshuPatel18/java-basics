package com.ivoyant.java;

import java.util.concurrent.locks.ReentrantLock;

class Demo1 implements Runnable {
    private final ReentrantLock lock1 = new ReentrantLock();

    public void run() {


        if (lock1.tryLock()) {
            try {
                for (int i = 0; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + "acquired lock is Running..." + i);

                }


            } finally {
                lock1.unlock();
            }


        } else {
            System.out.println("couldnt get lock");
        }
    }
}



public class tryLockExample  {
    public static void main(String[] args) throws InterruptedException {
        Demo1 d = new Demo1();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();

    }
}







