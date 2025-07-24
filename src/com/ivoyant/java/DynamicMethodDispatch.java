package com.ivoyant.java;
    class Animals {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dogs extends Animals {
        @Override
        void sound() {
            System.out.println(" barks");
        }
    }

    class Cats extends Animals {
        @Override
        void sound() {
            System.out.println(" meows");
        }
    }

    public class DynamicMethodDispatch {
        public static void main(String[] args) {
            Animals a=new Dogs();
            a.sound();

           Animals a1 = new Cats();
            a1 .sound();
        }
    }

