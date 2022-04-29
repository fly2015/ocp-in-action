/*
 * OrderInitializationOfClassDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch8_class_design;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OrderInitializationOfClassDemo3
{
    public static void main(String[] args)
    {
        new Hippo2();
        new Hippo2();
        new Hippo2();
    }
}


class Animal2
{
    static
    {
        System.out.print("A");
    }
    
    static int i = 0;
    
    static
    {
        System.out.print(i);
    }
}


class Hippo2 extends Animal2
{
    static
    {
        System.out.print(i);
    }
    static
    {
        System.out.print("B");
    }
}

/*
 * Changes:
 * $Log: $
 */