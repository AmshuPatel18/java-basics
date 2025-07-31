package com.ivoyant.java;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeset = new TreeSet();
        treeset.add(2);
        treeset.add(3);
        treeset.add(2);
        treeset.add(5);
        treeset.add(1);
        Iterator<Integer>it= treeset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());



        }
    }
}