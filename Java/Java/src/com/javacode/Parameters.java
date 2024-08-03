package com.javacode;

import java.net.StandardSocketOptions;

public class Parameters {

    //Parameterization
    public void intmtd(int num1){
        System.out.println(num1);
    }
    public void strmtd(String str){
        System.out.println(str);
    }
    public void test(int ...val){
        System.out.println(val[1]);
    }
    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Parameters object = new Parameters();
        object.intmtd(100);
        object.strmtd("Heisenberg");
        object.test(10,20,30);
        System.out.println(object.add(99,999));
    }
}
