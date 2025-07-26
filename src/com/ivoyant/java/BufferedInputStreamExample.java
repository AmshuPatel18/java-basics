package com.ivoyant.java;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C://Users//user//OneDrive//Desktop//BIS.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
            bis.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("error in file" + e.getMessage());
        }
    }
}
