/*
 * PassingGenericArgumentsDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.demo;

import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PassingGenericArgumentsDemo
{
    <T> T first(List< ? extends T> list)
    {
        return list.get(0);
    }
    
    
    B third(List<? super B> list)
    {
        return null;
    }
}

class ABC
{
    
}

/*
 * Changes:
 * $Log: $
 */