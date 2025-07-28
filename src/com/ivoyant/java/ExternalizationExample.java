package com.ivoyant.java;

import java.io.*;

     class Demo2 implements Externalizable {

        @Serial
        private static final long serialVersionUID =1L;
        private String name;
        private int age;
         public Demo2() {

         }

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

    public void writeExternal(ObjectOutput out)throws IOException {
        out.writeObject(name);
        out.writeObject(age);
    }
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException {
        name = (String) in.readObject();
    }}
    public class ExternalizationExample {
        public static void main(String[] args) throws IOException, ClassNotFoundException {


            Demo2 d = new Demo2();
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
            Demo2 d2=(Demo2)ois.readObject();

            System.out.println(d2.getName());
            System.out.println(d2.getAge());
            fis.close();
            ois.close();


        }
    }

