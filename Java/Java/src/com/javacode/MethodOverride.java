package com.javacode;
//Runtime Polymorphism
class Parent{
    void print(){
        System.out.println("Parent class");
    }
}
class Child1 extends Parent{
    void print(){
        System.out.println("Child 1");
    }
}
class Child2 extends Parent{
    void print(){
        System.out.println("Child 2");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Parent object;
        object = new Child1();
        object.print();
        object = new Child2();
        object.print();

    }

}
