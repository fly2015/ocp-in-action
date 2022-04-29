/*
 * OrderInitializationOfInstanceDemo.java
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
class GiraffeFamily
{
    static
    {
        System.out.print("A");
    }
    
    {
        System.out.print("B");
    }

    public GiraffeFamily(String name)
    {
        this(1);
        System.out.print("C");
    }


    public GiraffeFamily()
    {
        System.out.print("D");
    }


    public GiraffeFamily(int stripes)
    {
        System.out.print("E");
    }
}


class Okapi extends GiraffeFamily
{
    static
    {
        System.out.print("F");
    }

    public Okapi(int stripes)
    {
        super("sugar");
        System.out.print("G");
    }

    {
        System.out.print("H");
    }

    public static void main(String[] grass)
    {
        new Okapi(1);
        System.out.println();
        new Okapi(2);
    }

}


public class OrderInitializationOfInstanceDemo4
{

    public static void main(String[] args)
    {
        // AFBECHG
        // BECHG
    }
}

 
/*
 * Changes:
 * $Log: $
 */