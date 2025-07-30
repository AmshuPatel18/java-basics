package com.ivoyant.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringBufferedReaderExample {
    public static void main(String[] args) throws IOException {
try {
    BufferedReader br = new BufferedReader(new FileReader("C://Users//user//OneDrive//Desktop//example.txt"));
    String line;

        while ((line = br.readLine()) != null) {
            if(line.contains("Amshu")) {
            System.out.println(line);
        }
    }


    }   catch(IOException e){
        e.printStackTrace();
    }
}}
