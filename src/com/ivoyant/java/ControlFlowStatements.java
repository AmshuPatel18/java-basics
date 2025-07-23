package com.ivoyant.java;

import java.util.Scanner;

public class ControlFlowStatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int number=sc.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        }
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }


        if (number > 0) {
            if (number < 100) {
                System.out.println("The number is positive and less than 100.");
            } else {
                System.out.println("The number is positive and greater than or equal to 100.");
            }
        }

        System.out.println("Enter a day");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number.");
        }

        System.out.println("enter age");
        int age = sc.nextInt();
        String result = (age>= 18) ? "Adult" : "Minor";
        System.out.println("You are an " + result + ".");
    }
}
