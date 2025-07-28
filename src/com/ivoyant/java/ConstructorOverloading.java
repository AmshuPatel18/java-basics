package com.ivoyant.java;

    class Studentdata {
    String name;
    int age;
    int salary;
    String city;
    public Studentdata(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("name: "+name+"\nage: "+age);
    }
    public Studentdata(int salary,String name){
        this.name=name;
        this.salary=salary;
        this.city="Mysore";
        System.out.println("salary: "+salary+"\nname: "+name+"\ncity: "+city);

    }
    public Studentdata(String name,String city){
        this.name=name;
        this.city=city;
        System.out.println("name: "+name+"\ncity: "+city);

    }


}
public class ConstructorOverloading {


    public static void main(String[] args) {
        Studentdata s1 = new Studentdata("Amshu", "DVG");
        Studentdata s2 = new Studentdata("Asha", 22);
        Studentdata s3 = new Studentdata(250000, "Kavya");
    }

}