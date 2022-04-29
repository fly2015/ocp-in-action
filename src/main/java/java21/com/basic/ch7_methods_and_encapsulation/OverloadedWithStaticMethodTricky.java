/*
 * OverloadedWithStaticMethodTricky.java
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
public class OverloadedWithStaticMethodTricky
{
    public static String getName()
    {
        return "1";
    }
    
    /*
     * 
     * 
     * UN COMMENT THIS -> COMPILE ERROR BUT STILL CAN RUN (MAGIC)
     * 
     */

    /*
     * public String getName()
     * {
     * return "2";
     * }
     */
    public static void main(String[] args)
    {
        System.out.println(getName());
        System.out.println(new OverloadedWithStaticMethodTricky().getName());
    }
}



/*
 * Changes:
 * $Log: $
 */