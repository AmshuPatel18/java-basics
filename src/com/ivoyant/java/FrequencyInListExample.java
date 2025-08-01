package com.ivoyant.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyInListExample {

        public static void main(String[] args) throws InterruptedException {
            List<String > list= Arrays.asList("apple","cherry","banana","cherry","kiwi","cherry");
            System.out.println("the number of cherries are: "+ Collections.frequency(list,"cherry"));


        }}

