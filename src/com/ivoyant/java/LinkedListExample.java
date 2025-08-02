package com.ivoyant.java;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.addFirst(0);
        list.addLast(3);
        list.addLast(4);
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list);
    }
}
