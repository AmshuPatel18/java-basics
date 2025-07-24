package com.ivoyant.java;

public class MultiDimensionalArrays {

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2},
                    {3, 4},
                    {5, 6}};


            System.out.println("row 1, col 1: " + matrix[0][0]);
            System.out.println("row 3, col 2: " + matrix[2][1]);

            //looping
            System.out.println("All matrix elements:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

}
