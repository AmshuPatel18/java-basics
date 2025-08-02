package com.ivoyant.java;
class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(" thread running: " + currentThread() + i);
            }
        }
    }

        public class ThreadExample {
            public static void main(String[] args) {


                MyThread mt = new MyThread();
                mt.start();
            }
        }


