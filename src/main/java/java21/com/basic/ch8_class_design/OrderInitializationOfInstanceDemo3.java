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
public class OrderInitializationOfInstanceDemo3
{
    
    public static void main(String[] args)
    {
        // 0-Readyswimmy1Constructor
    }
}


class Cuttlefish
{
    private String name = "swimmy";
    
    {
        System.out.println(name);
    }
    
    private static int COUNT = 0;
    
    static
    {
        System.out.println(COUNT);
    }
    
    {
        COUNT++;
        System.out.println(COUNT);
    }

    public Cuttlefish()
    {
        System.out.println("Constructor");
    }


    public static void main(String[] args)
    {
        System.out.println("Ready");
        new Cuttlefish();
    }
}
/*
 * Changes:
 * $Log: $
 */