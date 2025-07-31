package com.ivoyant.java;


class New implements Runnable{
    StringBuilder sb;
    String data;

    public New(StringBuilder sb, String data) {
        this.sb = sb;
        this.data = data;
    }
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(data+"is on"+i);
            sb.append(data);
        }
    }
}

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        Thread t1=new Thread(new New(sb,"Data 1"));
        Thread t2=new Thread(new New(sb,"Data 2"));
        Thread t3=new Thread(new New(sb,"Data 3"));
        t1.start();
        t2.start();
        t3.start();


    }
}
