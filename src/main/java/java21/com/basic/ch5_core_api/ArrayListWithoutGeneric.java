/*
 * ArrayListWithoutGeneric.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch5_core_api;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ArrayListWithoutGeneric
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("hawk"); // [hawk]
        list.add(Boolean.TRUE); // [hawk, true]
        System.out.println(list); // [hawk, true]
        
        List<Integer> weights = new ArrayList();
        weights.add(1);
        //weights.add("a");
    }
}



/*
 * Changes:
 * $Log: $
 */