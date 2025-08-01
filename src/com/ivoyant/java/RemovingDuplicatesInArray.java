package com.ivoyant.java;

import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicatesInArray {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> elements=new ArrayList<>();
        elements.add("Amshu");
        elements.add("Asha");
        elements.add("Anvi");
        elements.add("Asha");
        HashSet<String> ele=new HashSet<>();
        for(String e:elements){
            if(!ele.contains(e)){
                ele.add(e);
            }

        }
        System.out.println(ele);


    }
}
