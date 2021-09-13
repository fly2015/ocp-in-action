/*
 * MapExample.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.functional.stream;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MapExample
{
    public static void main(String[] args)
    {
        List<String> stringList = List.of("10", "200", "3000", "3000");
        stringList.stream().map(s -> s.length()).forEach(System.out::println);
        stringList.stream().map(s -> s.length()).forEachOrdered(System.out::println);
        stringList.parallelStream().map(s -> s.length()).forEach(System.out::println);
        stringList.parallelStream().map(s -> s.length()).forEachOrdered(System.out::println);
        
        stringList.stream().flatMap(s -> Stream.of(s.charAt(1))).forEach(System.out::println);
        stringList.stream().flatMap(s -> IntStream.of(s.length()).boxed()).forEach(System.out::println);
        stringList.stream().mapToDouble(s -> Double.valueOf(s.length()/3)).forEach(System.out::println);
    }
}



/*
 * Changes:
 * $Log: $
 */