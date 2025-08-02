package com.ivoyant.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListsExample {
    public static void main(String[] args) {
        LinkedList<Integer> al = new LinkedList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.addFirst(0);
        al.addLast(6);
        al.set(2,33);
        for(Integer ele:al){
            System.out.println(ele);
        }
    }
}

