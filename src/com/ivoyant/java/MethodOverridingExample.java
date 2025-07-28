package com.ivoyant.java;


    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("meows");
        }
    }

    public class MethodOverridingExample {
        public static void main(String[] args) {
            Cat c = new Cat();
            c.sound();
        }
    }
