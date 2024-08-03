package com.javacode;
//Static polymorphism

public class MethodOverloading {
    public static int add(int num1){
        return num1;
    }
    public static int add(int num1, int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        System.out.println(add(100));
        System.out.println(add(100,800));
    }
}
