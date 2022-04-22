/*
 * SubStringTrick.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch5_core_api;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SubStringTrick
{
    public static void main(String[] args)
    {
        String string = "animals";
        System.out.println(string.substring(3, 3)); // emptystring
        System.out.println(string.substring(3, 2)); // throws exception
        System.out.println(string.substring(3, 8)); // throws exception
    }
}



/*
 * Changes:
 * $Log: $
 */