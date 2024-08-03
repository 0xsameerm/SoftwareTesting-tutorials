package com.javacode;

public class Finally {
    public static void main(String[] args) {
        try{
            String text = "Gus";
            System.out.println(text);

            String text1 = null;
            System.out.println(text1.length());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Im inside finally block");
        }
    }
}
