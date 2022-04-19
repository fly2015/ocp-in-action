/*
 * CollectorsExample.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_15_functional.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CollectorsExample
{
    public static void main(String[] args)
    {
        List<String> stringList1 = new ArrayList<String>();
        stringList1.add("1");
        stringList1.add(null);
        stringList1.add("ABC");
        stringList1.add("222");
        stringList1.add("10");
        
        System.out.println("-- CollectorsExample.toList()");
        //stringList1.stream().collect(CollectorsExample.toList());
        //stringList1.stream().filter(s -> s != null).distinct().peek(s -> System.out.println(s))
        //.collect(CollectorsExample.toMap((s) -> s.length(), (s) -> s)).forEach((k, v) -> System.out.println(k + ": " + v)); // Duplication exception if duplicate keys
        
        stringList1.stream()
        .filter(s -> s != null)
        .distinct()
        //.peek(s -> System.out.println(s))
        .collect(Collectors.toMap(s -> s.length(), Function.identity(), (l, s) -> l + "; " + s))
        .forEach((k, v) -> System.out.println(k + ": " + v)); 
        
        System.out.println("-- Collectors.toMap(4 params)");
        stringList1.stream()
        .filter(s -> s != null)
        .distinct()
       // .peek(s -> System.out.println(s))
        .collect(Collectors.toMap(s -> s.length(), 
                                  Function.identity(), 
                                  (l, s) -> l + "; " + s, 
                                  () -> new TreeMap<Integer, String>()))
        .forEach((k, v) -> System.out.println(k + ": " + v)); 
        
        System.out.println("-- Collectors.toCollection()");
        stringList1.stream()
        .filter(s -> s != null)
        .distinct()
        //.peek(s -> System.out.println(s))
        .collect(Collectors.toCollection(() -> new ArrayList<String>()))
        .forEach((v) -> System.out.println(v)); 
        
        
        
        Map<String, List<String>> collect = stringList1.stream()
        .filter(s -> s != null)
        .distinct()
        .collect(Collectors.groupingBy(s -> s));
        Set<Entry<String, List<String>>> entrySet = collect.entrySet();
        Stream<List<String>> map = entrySet.stream().map(Entry::getValue);
        Stream<String> flatMap = map.flatMap(Collection::stream);
        Predicate<String> predicate = String::isEmpty;
        predicate.negate();
        flatMap.collect(Collectors.partitioningBy(predicate.negate()));
    }
}



/*
 * Changes:
 * $Log: $
 */