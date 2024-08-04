package com.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        //List Interface
        List <String> arraylist = new ArrayList<String>();
        arraylist.add("Messi");
        arraylist.add("Neymar");
        arraylist.add("Neuer");
        System.out.println(arraylist);

        //Using Iterator
        Iterator itr = arraylist.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        //Using for each
        for(String str:arraylist)
            System.out.println(str);

        //accesing the element
        System.out.println(arraylist.get(2));

        //changing the element
        arraylist.set(2,"Kroos");
        System.out.println(arraylist.get(2));

        //Sorting the list
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        arraylist2.add(10);
        arraylist2.add(15);
        arraylist2.add(8);
        Collections.sort(arraylist2);
        for (Integer i :arraylist2)
            System.out.println(i);

    }
}
