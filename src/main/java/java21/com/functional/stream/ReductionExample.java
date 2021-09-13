/*
 * ReductionExample.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.functional.stream;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ReductionExample
{
    public static void main(String[] args)
    {
        List<String> stringList = List.of("10", "200", "3000", "3000");
        stringList.stream().reduce((s1, s2) -> { return s1.length() == 2 ? s1 : "";}).ifPresent(System.out::println);
        
        
        System.out.println(stringList.stream().reduce("Hien", (s1, s2) -> { return s1.concat(s2);}));
        
        BiFunction<Integer, String, Integer> accumulator = (i, s) -> { return i + s.length();};
        BinaryOperator<Integer> combiner = (i1, i2) -> { return i1 + i2;};
        System.out.println(stringList.stream().reduce(10, accumulator, combiner));
    }
}



/*
 * Changes:
 * $Log: $
 */