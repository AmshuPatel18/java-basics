package com.ivoyant.java;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;


class myTask implements Runnable {
    int count;

    myTask(int count) {
        this.count = count;
    }

    private static final ThreadLocal<Integer> tl = new ThreadLocal<>();

    public void run() {
        count++;

        tl.set(count);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(tl.get());
        tl.remove();

    }
}



public class Practisee {
    public static void main(String[] args) {
        Thread t1=new Thread(new myTask(2));
        Thread t2=new Thread(new myTask(3));
        t1.start();
        t2.start();
    }
}