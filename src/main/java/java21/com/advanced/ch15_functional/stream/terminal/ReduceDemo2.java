/*
 * ReduceDemo2.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.stream.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author nhqhien
 * @version $Revision: $
 */
public class ReduceDemo2
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");
        List<Predicate<String>> allPredicates = new ArrayList<Predicate<String>>();
        allPredicates.add(str -> str.startsWith("A"));
        allPredicates.add(str -> str.endsWith("m"));

        BinaryOperator<Predicate<String>> operator = (x, y) -> x.or(y);
        Predicate< ? super String> predicate = allPredicates.stream().reduce(x -> false, operator);
        
        // Identifier: F
        // L1: F OR T -> T OR T -> T
        // L2: T OR T -> T OR F -> T
        // L3: T OR F -> F OR F -> F
        // L4: F OR F -> F OR T -> T
        
        // Identifier: T
        // L1: T OR T -> T OR T -> T
        // L2: T OR T -> T OR F -> T
        // L3: T OR F -> T OR F -> T
        // L4: T OR F -> T OR T -> T

        names.stream().filter(predicate).collect(Collectors.toList()).forEach(System.out::println);
    }
}

/*
 * Changes:
 * $Log: $
 */