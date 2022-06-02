/*
 * BiFunctionDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.build_in;

import java.util.function.BiFunction;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class BiFunctionDemo
{
    public static void main(String[] args)
    {
        BiFunction<String, String, Integer> biFunc = (s1, s2) -> s1.length() * s2.length();
        System.out.println(biFunc.apply("abc", "ab"));
    }
}



/*
 * Changes:
 * $Log: $
 */