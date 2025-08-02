package com.ivoyant.java;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class SessionWorks implements Runnable{
    static Hashtable<Integer,String>newtable =new Hashtable<>();
    private int id;
    private String name;

    public SessionWorks(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void run(){
        newtable.put(id,name);
        System.out.println(Thread.currentThread().getName()+"is running with id "+id +"and name "+name);
    }
}
public class HashTableExample{
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new SessionWorks(1,"Thread one"));
        Thread t2=new Thread(new SessionWorks(2,"Thread two"));
        Thread t3=new Thread(new SessionWorks(3,"Thread three"));
        Thread t4=new Thread(new SessionWorks(4,"Thread four"));
        Thread t5=new Thread(new SessionWorks(5,"Thread five"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        System.out.println("entire map"+ SessionWorks.newtable);
    }}
