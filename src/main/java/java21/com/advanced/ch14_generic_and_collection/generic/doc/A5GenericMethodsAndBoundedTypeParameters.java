/*
 * A5GenericMethodsAndBoundedTypeParameters.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.doc;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class A5GenericMethodsAndBoundedTypeParameters
{
    //Bounded type parameters are key to the implementation of generic algorithms
    public static <T> int countGreaterThan(T[] anArray, T elem)
    {
        int count = 0;
        // for (T e : anArray)
        // if (e > elem) // compiler error
        // ++count;
        return count;
    }
     
    
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
    
    
    public static void main(String[] args)
    {
        String [] strArr = {"A", "B"};
        int countGreaterThan = countGreaterThan(strArr, "A");
        System.out.println(countGreaterThan);
    }
}



/*
 * Changes:
 * $Log: $
 */