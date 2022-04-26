/*
 * OverloadPrimitive.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch7_methods_and_encapsulation;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OverloadPrimitive
{
    /*
     * public void fly(int i)
     * {
     * System.out.print("int");
     * }
     */


    public void fly(long l)
    {
        System.out.print("long");
    }


    public static void main(String[] args)
    {
        OverloadPrimitive p = new OverloadPrimitive();
        p.fly(123); // Prin a Long  
        System.out.print("-");
        p.fly(123L);
    }
}



/*
 * Changes:
 * $Log: $
 */