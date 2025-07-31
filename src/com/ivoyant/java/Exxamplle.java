package com.ivoyant.java;

import java.util.*;

class Workers {
    String name;
    int age;

    public Workers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';


    }
}
public class Exxamplle {
    public static void main(String[] args) {
        ArrayList<Workers>al=new ArrayList<>();
        al.add(new Workers("Amshu",22));
        al.add(new Workers("Aliya",26));
        al.add(new Workers("Anvi",27));
        al.add(new Workers("Kavi",21));
        al.add(new Workers("Asha",28));
        Collections.sort(al, new Comparator<Workers>() {
            @Override
            public int compare(Workers o1, Workers o2) {
                return o1.name.compareTo(o2.name);

            }
        });
        System.out.println(al);
    }
}