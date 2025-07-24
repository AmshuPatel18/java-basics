package com.ivoyant.java;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    String name;
    int age;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return o.age - this.age;
    }
    public String toString(){
        return "Age:"+age+" \nName: "+name;
    }
}


public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Employee>list=new ArrayList<>();
        list.add(new Employee(25,"amshu"));
        list.add(new Employee(23,"asha"));
        list.add(new Employee(21,"priya"));
        Collections.sort(list);
        for(Employee ele : list){
            System.out.println(ele);
        }




    }
}