/*
 * PolymorphismTest.java
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
public class PolymorphismTest
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Animal animal = dog;
        CanRun canrun = dog;
        
        dog.eat();
        animal.eat();
        canrun.run();
        
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();
        animal1.eat();
        animal2.eat();
        animal3.eat();
        
        CharSequence ch1 = new String();
       // ch1.charAt(0);
        CharSequence ch2 = new StringBuilder();
       // ch2.charAt(0);
        
        String ch3 = new String();
        CharSequence ch4 = ch3;
        Object ch5 = ch3;
        
        
    }
}



/*
 * Changes:
 * $Log: $
 */