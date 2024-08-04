package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Messi");
        list.add("Neymar");
        list.add("Neuer");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Speed");
        list2.add("M10");

        //Adding list2 elements to list
        list.addAll(0,list2);

        //Removing an element
        list.remove(2);

        System.out.println("Updated list:"+list);


    }
}
