/*
 * FixedList.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch5_core_api;

import java.util.Arrays;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FixedList
{
    public static void main(String[] args)
    {
        String[] array = {"hawk", "robin"}; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk,test]
        array[0] = "new"; // [new,test]
        System.out.print(Arrays.toString(array));// [new,test]
        list.remove(1); // throws UnsupportedOperationException
    }
}



/*
 * Changes:
 * $Log: $
 */