/*
 * OptionalDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.optional;

import java.util.Optional;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OptionalDemo
{
    public static void main(String[] args)
    {
        Optional<String> opt = Optional.of("abc");
        opt.ifPresent(System.out::println);
    }
}



/*
 * Changes:
 * $Log: $
 */