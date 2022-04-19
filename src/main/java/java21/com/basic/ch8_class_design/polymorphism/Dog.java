/*
 * Dog.java
 *
 * Copyright by CRIF AG
 * Z�rich
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
    void eat()
    {
        System.out.println("Dog eat");
    }
    
    @Override
    public void run()
    {
        System.out.println("Dog can run.");
    }
    
}



/*
 * Changes:
 * $Log: $
 */