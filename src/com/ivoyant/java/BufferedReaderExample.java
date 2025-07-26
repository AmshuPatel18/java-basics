package com.ivoyant.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("C://Users//user//OneDrive//Desktop//BufferedReader.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            System.out.println("error in reading file"+e.getMessage());
        }
    }
}
