package com.ivoyant.java;

class Test implements Runnable{
    volatile boolean running=true;

    public void run(){
        while(running){
            System.out.println(".");
        }
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void stopRun(){

        running=false;
        System.out.println("Stopped the run");
    }
}

public class VolatileKeywordExample {
    public static void main(String[] args) throws InterruptedException {

    Test t=new Test();
    Thread t1= new Thread(()->t.run());
    t1.start();
    Thread.sleep(2000);

    Thread t2=new Thread(()->t.stopRun());
    t2.start();




}
}