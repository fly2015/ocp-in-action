/*
 * SafeVaragrsDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch13_anotation;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SafeVaragrsDemo
{
    //@SafeVarargs
    //public static void eat(int meal) {} // DOES NOT COMPILE
    //@SafeVarargs
    //protected void drink(String… cup) {} // DOES NOT COMPILE
    //@SafeVarargs void chew(boolean… food) {} // DOES NOT COMPILE
    @SafeVarargs
    final void chew(boolean... food) {}
    
    @SafeVarargs
    static void chew1(boolean... food) {}
    
    @SafeVarargs
    private void chew2(boolean... food) {}
}



/*
 * Changes:
 * $Log: $
 */