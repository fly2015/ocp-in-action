/*
 * CopyFileDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.nesteds;

import java.util.function.Predicate;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FunctionalDemo
{
    public Predicate<String> doSomething()
    {
        return s -> s.isEmpty();
    }
    
    public static void main(String[] args)
    {
        Predicate<String> doSomething = new FunctionalDemo().doSomething();
        System.out.println(doSomething.test("abc"));
    }
}



/*
 * Changes:
 * $Log: $
 */