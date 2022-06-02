/*
 * IntermediateDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.stream.intermediate;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class IntermediateDemo
{
    public static void main(String[] args)
    {
        List<String> list = List.of("Abc", "Bcde", "Cde", "Def");
        list.stream().takeWhile(s -> s.length() == 3).forEach(System.out::println);
        
    }
}



/*
 * Changes:
 * $Log: $
 */