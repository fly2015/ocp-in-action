/*
 * InstanceMethodOnParticularObjectDemo.java
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
public class InstanceMethodOnParticularObjectDemo
{
    public static void main(String[] args)
    {
        var str = "abc";
        Predicate<String> p1 = str::startsWith;
        System.out.println(p1.test("a1"));
    }
}



/*
 * Changes:
 * $Log: $
 */