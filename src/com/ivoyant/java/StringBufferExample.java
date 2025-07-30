package com.ivoyant.java;


import java.sql.SQLOutput;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;


class Testerr implements Runnable{
    String data ;
    StringBuffer sb ;
    Testerr(String data,StringBuffer sb){
        this.data=data;
        this.sb=sb;
    }

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"its running:  "+i);
            sb.append(data).append("   ->");
        }


    }
}

public class StringBufferExample{
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        StringBuffer sb=new StringBuffer();
        Thread t1=new Thread(new Testerr("Hi",sb));
        Thread t2=new Thread(new Testerr("Hello",sb));
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("final output from String Buffer");
        System.out.println(sb);

    }
}
