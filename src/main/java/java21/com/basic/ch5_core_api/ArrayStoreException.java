/*
 * ArrayStoreException.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch5_core_api;

import java.util.LinkedList;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ArrayStoreException
{
    public static void main(String[] args)
    {
        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[])objects;
        // againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        objects[0] = new StringBuilder();
        
        System.out.println(strings);
    }
}



/*
 * Changes:
 * $Log: $
 */