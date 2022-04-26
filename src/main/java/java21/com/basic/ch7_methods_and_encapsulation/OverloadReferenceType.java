/*
 * OverloadReferenceType.java
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
public class OverloadReferenceType
{
    public void fly(String s)
    {
        System.out.print("string");
    }


    public void fly(Object o)
    {
        System.out.print("object");
    }


    public static void main(String[] args)
    {
        OverloadReferenceType r = new OverloadReferenceType();
        r.fly("test");
        System.out.print("-");
        r.fly(56); // match object
    }
}


/*
 * Changes:
 * $Log: $
 */