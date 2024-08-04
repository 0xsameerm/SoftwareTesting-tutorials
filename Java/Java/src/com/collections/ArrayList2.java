package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    int rno,age;
    String name;
    //adding user defined class objects to arraylist
    ArrayList2(int rno, String name, int age){
        this.rno=rno;
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        //adding user defined class objects in arraylist
        ArrayList2 std1 = new ArrayList2(1,"Dhoni",7);
        ArrayList2 std2 = new ArrayList2(2,"Stokes",15);
        ArrayList2 std3 = new ArrayList2(3,"Jimmy",10);

        ArrayList<ArrayList2> stdlist =new ArrayList<ArrayList2>();
        stdlist.add(std1);
        stdlist.add(std2);
        stdlist.add(std3);

        Iterator<ArrayList2> itr = stdlist.iterator();
        while (itr.hasNext()) {
            ArrayList2 arr = itr.next();
            System.out.println(arr.rno + " " + arr.name + " " + arr.age);
        }


    }



}
