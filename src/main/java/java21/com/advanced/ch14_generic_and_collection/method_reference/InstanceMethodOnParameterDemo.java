/*
 * InstanceMethodOnParameterDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.method_reference;

import java.util.function.Predicate;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InstanceMethodOnParameterDemo
{
    public static void main(String[] args)
    {
        Predicate<String> p1  = String::isEmpty;
        System.out.println(p1.test(""));
    }
}



/*
 * Changes:
 * $Log: $
 */