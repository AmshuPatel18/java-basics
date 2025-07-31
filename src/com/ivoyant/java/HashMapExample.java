package com.ivoyant.java;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {


        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Amshu");
        map.put(2, "Kiara");
        map.put(4, "Tina");
        map.put(3, "Hania");
        map.put(6, "Miya");
        map.put(6,"rohi");
        Iterator<Map.Entry<Integer,String>>mapItr=map.entrySet().iterator();
        while(mapItr.hasNext()){
            System.out.println(mapItr.next());
        }
    }
}