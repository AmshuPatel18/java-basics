package com.ivoyant.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C://Users//user//OneDrive//Desktop//BufferedReader.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            String line = "\nnew line 2";
            bw.write(line);
            bw.newLine();
            bw.close();
            fw.close();

            System.out.println("Written to the file!");
        }
        catch (IOException e){
            System.out.println("error in writing"+e.getMessage());
        }
    }
}
