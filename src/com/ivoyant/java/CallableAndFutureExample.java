package com.ivoyant.java;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Add implements Callable<Integer> {
    int num1;
    int num2;
    public Add(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public Integer call() throws Exception{
         int result =num1+num2;
         System.out.println("the sum is: "+result+" executed by"+Thread.currentThread().getName());
         return result;

    }


}
class Factorial implements Callable<Integer> {
    int num;

    public Factorial(int num){
        this.num=num;

    }
    public Integer call() throws Exception{
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }

        System.out.println("the factorial is: "+fact+" executed by"+Thread.currentThread().getName());
        return fact;

    }


}

public class CallableAndFutureExample {
    public static void main(String[] args) {
        ExecutorService es= Executors.newSingleThreadExecutor();
        try{


        Future<Integer> f=es.submit(new Add(2,3));
            System.out.println("sum: "+f.get());
            Thread.sleep(1000);
            Future<Integer> f1=es.submit(new Factorial(5));

            System.out.println("fact : "+f1.get());
    } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            es.shutdown();
        }

        }
}
