/*
 * Dog.java
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
public class Dog extends Animal implements CanRun
{
    void getName()
    {
        System.out.println("The Dog.");
    }

    
    @Override
    public void run()
    {
        System.out.println("Dog is running.");
    }
    
}



/*
 * Changes:
 * $Log: $
 */