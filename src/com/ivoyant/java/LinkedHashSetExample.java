package com.ivoyant.java;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


class Students{
    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Students> set = new LinkedHashSet<>();
        set.add(new Students("Amshu",22));
        set.add(new Students("Asha",23));
        set.add(new Students("Miya",25));
        set.add(new Students("Amshu",22));
        set.add(new Students("Kavya",24));

        System.out.println(set);
    }
}
