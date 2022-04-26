/*
 * PolymorphismDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch8_class_design.polymorphism;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        
        // Via extending
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();
        animal1.getName();
        animal2.getName();
        animal3.getName();
        
        // Via implementation
        CanRun canRun1 = new Dog();
        canRun1.run();
        CanRun canRun2 = new Cat();
        canRun2.run();
    }
}



/*
 * Changes:
 * $Log: $
 */