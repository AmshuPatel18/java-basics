package com.ivoyant.java;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/C://Users//user//OneDrive//Desktop//Fis.txt/");
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error in file: " + e.getMessage());
        }
    }
}
