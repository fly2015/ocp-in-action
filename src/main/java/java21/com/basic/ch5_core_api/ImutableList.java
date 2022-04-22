/*
 * ImutableList.java
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
public class ImutableList
{
    public static void main(String[] args)
    {
        String[] array = {"hawk", "robin"}; // [hawk,robin]
        List<String> list = List.of(array); // returns immutable list
        System.out.println(list.size()); // 2
        array[0] = "new";
        System.out.println(Arrays.toString(array)); // [new,robin]
        System.out.println(list); // [hawk,robin]
        list.set(1, "test"); // throws UnsupportedOperationException
    }
}


/*
 * Changes:
 * $Log: $
 */