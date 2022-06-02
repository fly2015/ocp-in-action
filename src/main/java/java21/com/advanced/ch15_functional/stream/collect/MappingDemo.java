/*
 * MappingDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.stream.collect;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MappingDemo
{
    public static void main(String[] args)
    {
        /*
         * Suppose that we wanted to get
         * the first letter of the first animal alphabetically of each length
         */
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map1 = ohMy.collect(Collectors.groupingBy(
                                                          String::length, 
                                                          Collectors.counting()));
        System.out.println(map1); // {5=2, 6=1}
        
        Map<Integer, Optional<Character>> map = ohMy.collect(Collectors.groupingBy(
                                                           String::length, 
                                                           Collectors.mapping(
                                                                 s -> s.charAt(0), 
                                                                 Collectors.minBy((a, b) -> a - b))));
        System.out.println(map); // {5=Optional[b],6=Optional[t]}
    }
}



/*
 * Changes:
 * $Log: $
 */