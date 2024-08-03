package com.javacode;
class EncapsulationExp {
    private String name;
    private int num;

    //Getter
    public String getname(){
        return name;
    }
    //Setter
    public void setname(String newname){
        this.name=newname;
    }
    public int getnum(){
        return num;
    }
    public void setnum(int newnum){
        this.num=newnum;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        EncapsulationExp object = new EncapsulationExp();
        object.setname("Walter White");
        System.out.println(object.getname());

        object.setnum(5);
        System.out.println(object.getnum());

       // object.name = "Error since its private";
    }

}
