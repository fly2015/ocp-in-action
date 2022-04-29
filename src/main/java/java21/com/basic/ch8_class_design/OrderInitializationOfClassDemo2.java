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
public class OrderInitializationOfClassDemo2
{
    public static void main(String[] args)
    {
        Hippo.main(null);
    }
}


class Animal
{
    static
    {
        System.out.print("A");
    }
}


class Hippo extends Animal
{
    static
    {
        System.out.print("B");
    }

    public static void main(String[] grass)
    {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }
}

/*
 * Changes:
 * $Log: $
 */