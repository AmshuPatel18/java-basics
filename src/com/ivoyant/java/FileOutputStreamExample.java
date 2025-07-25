package com.ivoyant.java;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C://Users//user//OneDrive//Desktop//Fis.txt", true);
            String text = "New line by FileOutputStream";
            fos.write(text.getBytes(StandardCharsets.UTF_8));
            System.out.println("Sucessfully Written in the File");
            fos.close();
        } catch (IOException e) {
            System.out.println("error in file" + e.getMessage());
        }
    }

}
