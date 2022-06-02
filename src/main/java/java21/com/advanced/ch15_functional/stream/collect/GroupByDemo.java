/*
 * GroupByDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.stream.collect;

import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class GroupByDemo
{
    public static void main(String[] args)
    {
        var ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map = ohMy.collect(Collectors.groupingBy(String::length, 
                                                                               TreeMap::new,
                                                                               Collectors.toSet()));
        System.out.println(map);
    }
}



/*
 * Changes:
 * $Log: $
 */