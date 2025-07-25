package com.ivoyant.java;
    class Addition{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        Addition a=new Addition();
        System.out.println(a.add(1,2));
        System.out.println(a.add(2,3,4));
        System.out.println(a.add(5,6,7,8));
    }
}