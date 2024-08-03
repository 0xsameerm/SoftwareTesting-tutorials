package com.javacode;
//cannot override static and final methods
//can call a static method without creating a object
class InheritanceParent {
    public static void animalname(){
        System.out.println("animal name method");
    }
    public void animaltype(){
        System.out.println("animal type method");
    }
    public final void animalsound(){
        System.out.println("animal sound method");
    }
}
public class InheritanceChild extends InheritanceParent {
    public void  animaltype(){
        System.out.println("Override method");
    }

    public static void main(String[] args) {
        InheritanceParent object = new InheritanceChild();
        object.animaltype();
       // animalname();
        InheritanceParent.animalname();
    }
}
