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

class Animal
{
    void getName()
    {
        System.out.println("An Animal.");
    }
}

interface CanRun
{
    void run();
}

class Cat extends Animal implements CanRun
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

class Dog extends Animal implements CanRun
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