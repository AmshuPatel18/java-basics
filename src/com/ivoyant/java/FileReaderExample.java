package com.ivoyant.java;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {


        try {
            FileReader fr = new FileReader("C://Users//user//OneDrive//Desktop//filereader.txt");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);

            }

            fr.close();
        }
        catch(IOException e){
                System.out.println("error in file reading" + e.getMessage());

        }
    }
}