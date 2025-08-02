package com.ivoyant.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringBufferedWriterExample {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("C://Users//user//OneDrive//Desktop//example.txt",true));
        String data="new line added 2.0";
        bw.write(data);
        bw.newLine();
        System.out.println("done writing");
        bw.close();

    }
}
