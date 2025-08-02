package com.ivoyant.java;

import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    int balance = 1000;
    private final ReentrantLock rl = new ReentrantLock();

    public void withdraw(int amount) {
        rl.lock(); //  acquire the lock!!!
        try {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " - Not enough balance " + amount);
            }
        } finally {
            rl.unlock(); // always unlock
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Thread-1");
        Thread t2 = new Thread(() -> account.withdraw(500), "Thread-2");

        t1.start();
        t2.start();
    }
}
