package com.ivoyant.java;

import java.util.ArrayList;
import java.util.Collections;
        public class SortAndSearchArrayLists {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            //adding
            list.add("Amshu");
            list.add("Priya");
            list.add("Asha");
            list.add("Kusum");
            list.add("Kavya");
            list.add("Anvi");
            System.out.println("List of names:"+list);
            //sort
            System.out.println("Sorting ArrayList:");
            Collections.sort(list);
            for(String elements: list){
                System.out.println(elements);
            }
            //search
            int index =Collections.binarySearch(list,"Kusum");
            System.out.println("element found at the index: "+index);
        }
    }



