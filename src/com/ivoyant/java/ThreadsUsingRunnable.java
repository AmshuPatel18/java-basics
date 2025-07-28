package com.ivoyant.java;

class Thread1 implements Runnable{
    public void run(){
        for(int i =0; i<5; i++){
            System.out.println("Thread: "+Thread.currentThread()+i);
        }
    }
}

public class ThreadsUsingRunnable {
    public static void main(String[] args) {
        System.out.println("main thread running");

        Thread t = new Thread(()->{
        for(int i =0; i<5; i++) {
            System.out.println("Thread: " + Thread.currentThread() + i);
        }});
        t.start();
    }
}
