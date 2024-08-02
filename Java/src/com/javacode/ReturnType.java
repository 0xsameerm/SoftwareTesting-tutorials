package com.javacode;

public class ReturnType {
    Long accNumber = 123456789L;
    String name = "Jesse";
    Integer accBalance = 7999;

    public Integer getBalance(){
        System.out.println("Account balance is "+accBalance);
        return accBalance;
    }


    public static void main(String[] args) {
    ReturnType account = new ReturnType();
    Integer amount = account.getBalance();
    System.out.println(amount);

    }
}
