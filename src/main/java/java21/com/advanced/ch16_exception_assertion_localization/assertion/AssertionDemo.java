/*
 * AssertionDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch16_exception_assertion_localization.assertion;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AssertionDemo
{
    public static void main(String[] args)
    {
        int age = 10;
        assert 1 == age;
        int height = 2;
        int length = 100;
        
        assert(2 == height);
        assert 100.0 == length : "Problem with length";
    }
}



/*
 * Changes:
 * $Log: $
 */