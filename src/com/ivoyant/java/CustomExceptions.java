package com.ivoyant.java;


class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
class BankAccount{
    int balance=5000;

    public void withdraw(int amount)throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Low on balance! You only have: "+balance);

        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawal of amount: "+amount+"\nRemaining balance is: "+balance);
        }
    }
}
public class CustomExceptions{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        try {
            b.withdraw(8000);
        } catch (InsufficientBalanceException e) {
            {
                e.printStackTrace();
            }
        }
    }}