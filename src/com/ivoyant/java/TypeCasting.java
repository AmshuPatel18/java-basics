package com.ivoyant.java;

public class TypeCasting {

        static final double PI = 3.14159;
        public static void main(String[] args) {

            double radius = 5;
            double area = PI * radius * radius;
            System.out.println("Area of circle " + area);
            int a = 100;
            double b = a;
            System.out.println("widened value " + b);
            double x = 45.67;
            int y = (int) x;
            System.out.println("narrowed value " + y);

            Student s1 = new Student("Amshu", 22);
            s1.displayInfo();
        }
    }

    class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayInfo() {
            System.out.println("com.ivoyat.java.Student Name: " + name);
            System.out.println("com.ivoyat.java.Student Age: " + age);
        }
    }


