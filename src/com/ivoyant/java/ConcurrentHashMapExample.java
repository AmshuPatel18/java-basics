package com.ivoyant.java;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;



class SessionUpdater implements Runnable {
    private static ConcurrentHashMap<Integer, String> conmap = new ConcurrentHashMap<>();
    private int sessionID;
    private String role;

    SessionUpdater(String role, int sessionID) {
        this.role = role;
        this.sessionID = sessionID;
    }

    public void run() {
        conmap.put(sessionID, role);
        System.out.println(Thread.currentThread().getName() + "is runningID " + sessionID + " of role" + role);

    }

    public static ConcurrentHashMap<Integer, String> getMap() {
        return conmap;
    }
}
public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new SessionUpdater("backend", 1));
        Thread t2 = new Thread(new SessionUpdater("frontend", 2));
        Thread t3 = new Thread(new SessionUpdater("ai", 3));
        Thread t4 = new Thread(new SessionUpdater("ml", 4));
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("entire map" + SessionUpdater.getMap());
    }

}
