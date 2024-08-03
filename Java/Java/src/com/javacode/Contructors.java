package com.javacode;

public class Contructors {
    String empname;
    Integer empid;
    int x;
    //Constructors

    Contructors(){
       x=5;
    }

    Contructors(int num){
        System.out.println(num);
    }

    //Parameterized constructor
    public Contructors(String name, Integer id){
        empname=name;
        empid=id;
        System.out.println(empname);
    }

    public static void main(String[] args) {
        new Contructors(99);
        new Contructors("Skyler",420);

        //Default constructor
        Contructors object = new Contructors(); // Create an object of Main class (This will call the constructor)
        System.out.println(object.empid);
        System.out.println(object.x);
  ;  }
}
