/*
 * ArrayAndListConversions.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch5_core_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ArrayAndListConversions
{
    public static void main(String[] args)
    {
        List<String> originalList = new ArrayList<String>();
        originalList.add("a");
        originalList.add("b");
        originalList.add("c");
        String [] originalArr = {"a", "b", "c"};
        
        /*
         * List to array
         * returned a new copied array from the input list
         */
        String[] arrayFromOriginalList = originalList.toArray(new String [3]);
        // can remove? -> no supporting method
        // can change value at index? -> yes
        arrayFromOriginalList[0] = null;
        System.out.println(Arrays.toString(arrayFromOriginalList));
        // can affect to originalList? -> No
        System.out.println(originalList.toString());
        
        /*
         * Create a list from array by Arrays util
         * fixed list because list point to the same address with input array
         */
        List<String> asListFromOriginalArr = Arrays.asList(originalArr); 
        // Can remove or add? -> NO
        // -> asListFromOriginalArr.remove(0); //UnsupportedOperationException
        // ->asListFromOriginalArr.add("100");
        
        // Can change value? -> YES
        asListFromOriginalArr.set(0, "new");
        System.out.println(asListFromOriginalArr.toString());
        // can affect to originalArr? -> Yes
        System.out.println(Arrays.toString(originalArr));
        
        
        /*
         * Convert an array to List
         * Return immutable list
         * 
         */
        List<String> listFromOriginalArr = List.of(originalArr);
        // Can remove or add? -> NO
        // -> listFromOriginalArr.remove(0); //UnsupportedOperationException
        
        // Can change value? -> NO
        // listFromOriginalArr.set(0, "imutable");
        
        // Can affect after changing original -> NO (N/A)
        originalArr[0] ="200";
        System.out.println(listFromOriginalArr.toString());
    }
}



/*
 * Changes:
 * $Log: $
 */