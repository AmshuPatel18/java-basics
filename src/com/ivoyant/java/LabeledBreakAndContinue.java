package com.ivoyant.java;

public class LabeledBreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Labeled break example:");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    System.out.println("Breaking outer loop when j = 2");
                    break outerLoop; //this is gonna exit both loops
                }
                System.out.println("i: "+" "+i +"j: "+ j);
            }
        }
        System.out.println("\nLabeled continue example:");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    System.out.println("Continuing outer loop when j = 2");
                    System.out.println("i = " + i + ", j = " + j);
                    continue outerLoop;

                }

            }
        }
    }
}

