/*
 * VarargsUsing.java
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
public class VarargsUsing
{
    public static void main(String[] args)
    {
        List<String> list1 = Arrays.asList("one", "two");
        List<String> list2 = List.of("one", "two");
    }
}



/*
 * Changes:
 * $Log: $
 */