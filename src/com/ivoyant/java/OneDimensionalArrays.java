package com.ivoyant.java;

public class OneDimensionalArrays {

        public static void main(String[] args) {


            String[] fruits = {"Apple", "Banana", "Mango", "Grapes"};


            System.out.println(fruits[0]);


            System.out.println("All fruits:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            //length
            System.out.println("Total number of fruits: " + fruits.length);
        }
    }


