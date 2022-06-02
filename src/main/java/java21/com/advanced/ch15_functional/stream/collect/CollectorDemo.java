/*
 * CollectorDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.stream.collect;

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
public class CollectorDemo
{
    public static void main(String[] args)
    {
        List<String> list = List.of("Abc", "Bcde", "Cde", "Def");
        
        BinaryOperator<String> mergeFunction = (s, y) -> y + "-" + s;
        list.stream().collect(Collectors.toMap(String::length, s -> s, mergeFunction)).forEach((k, v) -> System.out.println(k + ": " + v));;
        
        Supplier<Map<Integer, String>> mapF = TreeMap::new;
        list.stream().collect(Collectors.toMap(String::length, s -> s, mergeFunction, mapF));
    }
}



/*
 * Changes:
 * $Log: $
 */