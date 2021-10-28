/*
 * Dog.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.classdesign.polymorphism;

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