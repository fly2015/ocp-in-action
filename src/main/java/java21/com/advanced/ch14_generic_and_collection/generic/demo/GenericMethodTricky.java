/*
 * GenericMethodTricky.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.demo;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class GenericMethodTricky
{
    
}


class Crate<T>
{
    public <T> T tricky(T t)
    {
        return t;
    }
    
    public static String getName()
    {
        Crate<Integer> crate = new Crate<>();
        return crate.tricky("bot");
    }
}

/*
 * Changes:
 * $Log: $
 */