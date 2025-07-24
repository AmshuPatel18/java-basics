package com.ivoyant.java;

public class Loops {

        public static void main(String[] args) {
            System.out.println("For loop:");
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
            System.out.println("\nEnhanced for loop:");
            int[] numbers = {10, 20, 30, 40, 50};
            for (int num : numbers) {
                System.out.println(num);
            }
            System.out.println("\nWhile loop:");
            int count = 5;
            while (count > 0) {
                System.out.println(count);
                count--;
            }
            System.out.println("\nDo while loop:");
            int input = 0;
            do {
                System.out.println(input);
                input++;
            } while (input < 3);
            System.out.println("\nLoop with break and continue:");
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {

                    continue;}
                if (i == 5) {
                    System.out.println(i);
                    break;}
                System.out.println(i);
            }
        }
    }



