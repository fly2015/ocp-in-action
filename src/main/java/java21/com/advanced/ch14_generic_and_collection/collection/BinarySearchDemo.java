/*
 * BinarySearchDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class BinarySearchDemo
{
    public static void main(String[] args)
    {
        var names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        var index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println(index);
    }
}



/*
 * Changes:
 * $Log: $
 */