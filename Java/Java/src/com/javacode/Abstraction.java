package com.javacode;
// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class cat extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cat says: meow");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        cat mycat = new cat(); // Create a Pig object
        mycat.animalSound();
        mycat.sleep();
    }
}
