package com.ivoyant.java;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Example{
    String name;
    int id;

    public Example(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return id == example.id && Objects.equals(name, example.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
public class HashSetExample {
    public static void main(String[] args) {
        Set<Example> set=new HashSet<>();
        set.add(new Example("Amshu",22));
        set.add(new Example("Riya",23));
        set.add(new Example("Kavya",24));
        set.add(new Example("Amshu",22));

        System.out.println(set);
    }
}


