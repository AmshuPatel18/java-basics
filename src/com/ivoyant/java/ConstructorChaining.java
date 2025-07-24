package com.ivoyant.java;



class Vehicle{
    String colour;
    int wheels;
    String price;
    Vehicle(String colour,int wheels){
        this.colour=colour;
        this.wheels=wheels;
    }
    Vehicle(String price){
        this("Red",4);
        this.price=price;
        System.out.println("Colour: "+colour+"\nWheels: "+wheels+"\nPrice: "+price);
    }



    }


public class ConstructorChaining
{
    public static void main(String[] args) {
        Vehicle v=new Vehicle("1000 dollars");
    }

}
