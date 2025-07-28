package com.ivoyant.java;

import java.util.ArrayList;

public class ArraysLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //adding
        list.add("Amshu");
        list.add("Priya");
        list.add("Asha");
        list.add("Kusum");
        list.add("Kavya");
        list.add("Anvi");
        System.out.println("List of names:"+list);
        //remove
        list.remove("Amshu");

        System.out.println("List after removal:"+list);
        //access
        System.out.println("Acessing the list of names:");
        for (String e : list) {
            System.out.println(e);


        }

        System.out.println("Iteration using enhanced for loop:");
        for (String e : list) {
            System.out.println(e);
        }
        System.out.println("Iteration using for loop with index:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("Iteration using lambda expressions from java 8");
        list.forEach(names -> System.out.println(names));

    }
}