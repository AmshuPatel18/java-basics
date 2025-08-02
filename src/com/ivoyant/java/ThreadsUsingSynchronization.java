package com.ivoyant.java;

class BankAccs {
    public int balance = 1000;


    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawed ₹" + amount);
            balance = balance - amount;
            System.out.println("Remaining balance: ₹" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Low balance for ₹" + amount);
        }
    }
}

public class ThreadsUsingSynchronization {
    public static void main(String[] args) {
        BankAccs ba = new BankAccs();


        Thread t1 = new Thread(()->
                ba.withdraw(100));




        Thread t2 = new Thread(()->
        ba.withdraw(200));


        t1.start();
        t2.start();
    }
}
