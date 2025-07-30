package com.ivoyant.java;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class NewThread implements Runnable{
    private CountDownLatch latch;
    private String name;
    NewThread(CountDownLatch latch,String name){
        this.latch=latch;
        this.name=name;
    }
    public void run(){
        for(int i=0; i<=5;i++){
            System.out.println(Thread.currentThread().getName() +" is running "+i);
        }
        latch.countDown();
    }
}
public class CountDownLatchExample{
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(2);
        Thread t1=new Thread(new NewThread(latch,"amshu"));
        Thread t2=new Thread(new NewThread(latch,"riya"));
        t1.setName("amshu");
        t2.setName("priya");
        t1.start();
        t2.start();
        System.out.println("main thread waiting till the threads finishes");
        latch.await(2, TimeUnit.SECONDS);
        System.out.println("all done! main thread can continue");


    }
}