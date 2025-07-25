package com.ivoyant.java;

interface Switch{
    abstract void switchon();
    abstract void switchoff();
}
class Light implements Switch{
    @Override
    public void switchon(){
        System.out.println("com.ivoyant.java.Light is on");
    }
    public void switchoff(){
        System.out.println("com.ivoyant.java.Light is off");
    }

}
//multiple inheritance is implemented here
class Bulb implements Switch{
    public void switchon(){

        System.out.println("com.ivoyant.java.Bulb is on");
    }
    public void switchoff(){
        System.out.println("com.ivoyant.java.Bulb is off");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {


        Light l = new Light();
        l.switchon();
        l.switchoff();
        Bulb b = new Bulb();
        b.switchon();
        b.switchoff();
    }
}
