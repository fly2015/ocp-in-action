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
public class OrderInitializationOfClassDemo
{
    public static void main(String[] args)
    {
        System.out.print("C");
        new Hippo1();
        new Hippo1();
        new Hippo1();
    }
}


class Animal1
{
    static
    {
        System.out.print("A");
    }
}


class Hippo1 extends Animal1
{
    static
    {
        System.out.print("B");
    }
}

/*
 * Changes:
 * $Log: $
 */