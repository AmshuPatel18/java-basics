package com.ivoyant.java;


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();
        al.add("amshu");
        al.add("anvi");
        al.add("vinay");
        al.add("viju");
        al.add("piya");
        System.out.println("The list of names: " + al);
        al.remove("piya");
        for (String elements : al) {
            if (elements.contains("a")) {
                System.out.println("The present names are: " + elements);
            }

        }
    }}