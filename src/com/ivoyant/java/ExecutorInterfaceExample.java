package com.ivoyant.java;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


class Work implements Runnable {
    int id;

    Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Task ID " + id + " - " + Thread.currentThread().getName() + " is running: " + i);
        }
    }
}

public class ExecutorInterfaceExample {
    public static void main(String[] args) {
        // Creating a single-thread executor
        Executor ex = Executors.newSingleThreadExecutor();
        ex.execute(new Work(1));
        ex.execute(new Work(2));

    }
}
