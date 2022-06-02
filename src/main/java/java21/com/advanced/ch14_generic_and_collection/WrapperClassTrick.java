/*
 * WrapperClassTrick.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection;

import java.util.ArrayList;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class WrapperClassTrick
{
    public static void main(String[] args)
    {
        var heights = new ArrayList<Integer>();
        heights.add(null);
        int h = heights.get(0); // NullPointerException cos unboxing null to primitive
    }
}



/*
 * Changes:
 * $Log: $
 */