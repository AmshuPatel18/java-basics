package com.ivoyant.java;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.*;

class Task implements Runnable{
    int id;
    Task(int id){
        this.id=id;
    }
    public void run(){
        for(int i =1;i<=5;i++){
            System.out.println("running "+i+" by "+Thread.currentThread().getName());
        }

    }}

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        ScheduledExecutorService se =  Executors.newScheduledThreadPool(5);
        se.scheduleAtFixedRate(new Task(1),2,3, TimeUnit.SECONDS);
        se.scheduleAtFixedRate(new Task(2),2,3, TimeUnit.SECONDS);
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        se.shutdown();
        System.out.println("All tasks completed .");

    }
}
