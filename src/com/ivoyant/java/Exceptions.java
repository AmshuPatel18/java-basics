package com.ivoyant.java;


 class Voting {
    int age;
    public void vote(int age)throws ArithmeticException{
        this.age=age;
        if(age<18){
            throw new ArithmeticException("Age must be above eighteen to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }

    }

}
public class Exceptions {
    public static void main(String[] args) {
        Voting v =new Voting();
        try{
            v.vote(19);

        }
        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
