package com.ivoyant.java;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

class TLExample implements Runnable{
    String data;
    TLExample(String data){
        this.data=data;
    }
    private static final ThreadLocal<String>tl=new ThreadLocal<>() {

        public String initialValue() {
            return "Default Data";
        }
    };
    public void run(){

        //tl.set(data); //while using indivually remove braces from new ThreadLocal Object!

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("our thread "+Thread.currentThread().getName()+" has: "+tl.get());
        tl.remove();
    }
}
public class ThreadLocalExample {
    public static void main(String[] args) {
        Thread t1=new Thread(new TLExample("data for thread one"));
        Thread t2=new Thread(new TLExample("data for thread two"));
        t1.start();
        t2.start();
    }
}