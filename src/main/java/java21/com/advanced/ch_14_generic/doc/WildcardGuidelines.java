/*
 * WildcardGuidelines.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_14_generic.doc;

import java.util.List;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class WildcardGuidelines
{
    // An "in" variable is defined with an upper bounded wildcard, using the extends keyword.
    // An "out" variable is defined with a lower bounded wildcard, using the super keyword.
    // In the case where the "in" variable can be accessed using methods defined in the Object class, use an unbounded wildcard.
    // In the case where the code needs to access the variable as both an "in" and an "out" variable, do not use a wildcard.

    //These guidelines do not apply to a method's return type.
    // Using a wildcard as a return type should be avoided because it forces programmers using the code to deal with wildcards.
    
    public <T> List< ? > doSomething(T t)
    {
        return null;
    }
}



/*
 * Changes:
 * $Log: $
 */