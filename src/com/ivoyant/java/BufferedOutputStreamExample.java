package com.ivoyant.java;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

    public class BufferedOutputStreamExample {
        public static void main(String[] args) {
            String data = "Have a good day!";

            try {

                FileOutputStream fos = new FileOutputStream("output_buffered.txt");


                BufferedOutputStream bos = new BufferedOutputStream(fos);


                bos.write(data.getBytes());


                bos.flush();
                bos.close();

                System.out.println("Data written using BufferedOutputStream.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

