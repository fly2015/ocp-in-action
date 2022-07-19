/*
 * ParallelReductionOnACollector.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.paralellstream;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ParallelReductionOnACollector
{
    public static void main(String[] args)
    {
        //parallelStream.collect(Collectors.toSet()); // Not a parallel reduction
        
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, String> map = ohMy.collect(Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println(map); // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap
        
        
        
        ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, List<String>> map1 = ohMy.collect(Collectors.groupingByConcurrent(String::length));
        System.out.println(map1); // {5=[lions, bears], 6=[tigers]}
        
        
        ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ohMy.collect(Collectors.toSet()); // Not a parallel reduction
    }
}



/*
 * Changes:
 * $Log: $
 */