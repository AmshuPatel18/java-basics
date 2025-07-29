package com.ivoyant.java;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable{
    int id;
    public Tasks(int id){
        this.id=id;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("task with id: "+id+" is running: "+i+" by "+Thread.currentThread().getName());
        }
    }
}

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(3);
        es.execute(new Tasks(1));
        es.execute(new Tasks(2));
        es.shutdown();

    }
}
