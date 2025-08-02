package com.ivoyant.java;

public class StringsExample {
    public static void main(String[] args) {
        String s="Hello World and java";



        String s2=s.substring(6,11).replace("d","D");
        String updates=s.replace("World",s2);
        System.out.println(updates);
    }
}