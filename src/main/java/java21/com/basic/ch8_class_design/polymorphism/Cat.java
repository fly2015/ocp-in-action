/*
 * Cat.java
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
public class Cat extends Animal implements CanRun
{
    
    @Override
    void getName()
    {
        System.out.println("The Cat.");
    }

    /**
     * @see java21.com.basic.ch8_class_design.polymorphism.CanRun#run()
     */
    @Override
    public void run()
    {
        System.out.println("Cat is running.");
    }
}



/*
 * Changes:
 * $Log: $
 */