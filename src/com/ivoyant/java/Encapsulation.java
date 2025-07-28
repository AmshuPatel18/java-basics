package com.ivoyant.java;

class Example {
     private String name;
     private int age;

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }

   public class Encapsulation {
       public static void main(String[] args) {
           Example e = new Example();
           e.setAge(10);
           System.out.println("Age: " + e.getAge());
           e.setName("amshu");
           System.out.println("Name: " + e.getName());
       }
   }

