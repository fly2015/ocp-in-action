/*
 * StaticAccessViaObjectInstance.java
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
public class StaticAccessViaObjectInstance
{
    private static int count = 10;
    public static void main(String[] args)
    {
        StaticAccessViaObjectInstance instance = null;
        System.out.println(instance.count);
    }
}



/*
 * Changes:
 * $Log: $
 */