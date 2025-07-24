package com.ivoyant.java;

public class AccessingArrays {

    public static void main(String[] args) {
        int[] numbers = new int[3];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // access
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // Looping
        System.out.println("All Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}