package com.ivoyant.java;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C://Users//user//OneDrive//Desktop//filereader.txt",true);
            String text = "\nNew Text Line Added 3 ";
            fw.write(text);

            System.out.println("Written in file succesfully!");
            fw.close();

        } catch (IOException e) {
            System.out.println("Error in writing to file"+e.getMessage());
        }


        }
    }

