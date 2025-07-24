package com.ivoyant.java;

class Person {
    String name;
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor: " + name);
    }
    void display() {
        System.out.println("Name: " + name);
    }
}

class Students extends Person {
    int roll;
    Students(String name, int roll) {
        super(name);
        this.roll = roll;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Roll: " + roll);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Students s = new Students("Amshu", 101);
        s.display();
    }
}
