package com.ivoyant.java;

import java.io.*;

class Demo implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SerializationAndDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Demo d = new Demo();
        d.setAge(20);
        d.setName("Amshu");
        FileOutputStream fos = new FileOutputStream("C://Users//user//OneDrive//Desktop//SerializationDeserialization.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        fos.close();
        oos.close();

        //deserialize
        FileInputStream fis= new FileInputStream("C://Users//user//OneDrive//Desktop//SerializationDeserialization.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Demo d2=(Demo)ois.readObject();
        System.out.println(d2.getAge());
        System.out.println(d2.getName());
        fis.close();
        ois.close();


    }
}