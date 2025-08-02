package com.ivoyant.java;


import javax.swing.plaf.basic.BasicTreeUI;
import java.util.concurrent.Semaphore;

class Worker implements Runnable{
    private Semaphore sem;
    private String name;

    public Worker(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

    public void run(){
        System.out.println(name+" is waiting for permit to work...");
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" got permit working");
        for(int i=0;i<=5;i++){
            System.out.println(name+"worked with "+i);
        }

        System.out.println("all work done");
        sem.release();
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore sem=new Semaphore(2);
        Thread t1=new Thread(new Worker(sem,"thread-one"));
        Thread t2=new Thread(new Worker(sem,"thread-two"));
        Thread t3=new Thread(new Worker(sem,"thread-three"));
        Thread t4=new Thread(new Worker(sem,"thread-four"));
        Thread t5=new Thread(new Worker(sem,"thread-five"));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}