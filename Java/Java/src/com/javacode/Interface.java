package com.javacode;

interface printable{
    void print();// interface method (does not have a body)
}
public class Interface implements printable{
    @Override
    public void print() {
        System.out.println("Hello Guys"); //The Body of print() is provided here
    }

    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.print();
    }
}

