package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet <String> set = new HashSet<String>();
        set.add("Capo");
        set.add("Capo");
        set.add("wizz");
        set.add("CZ");
        //Ignores the duplicate elements and prints unordered
        for(String str:set){
            System.out.println(str);
        }



    }
}
