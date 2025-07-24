package com.ivoyant.java;

import java.util.*;


class Employees {
    String name;
    int id;

    public Employees(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Employees> list = new ArrayList<>();
        list.add(new Employees("Amshu", 102));
        list.add(new Employees("Priya", 101));
        list.add(new Employees("Asha", 103));


        Comparator<Employees> compareByName = new Comparator<Employees>() {
            @Override
            public int compare(Employees o1, Employees o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(list, compareByName);

        for (Employees e : list) {
            System.out.println(e);
        }
    }
}
