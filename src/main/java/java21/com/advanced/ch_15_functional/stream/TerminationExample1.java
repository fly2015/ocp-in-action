/*
 * TerminationExample1.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_15_functional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TerminationExample1
{
    public static void main(String[] args)
    {
        List<String> stringList = List.of("1", "5", "3", "1");
        List<String> stringList1 = new ArrayList<String>();
        stringList1.add("1");
        stringList1.add(null);
        stringList1.add("ABC");
        stringList1.add("222");
        stringList1.add("10");
        

        Stream<String> stream = stringList.stream();
        System.out.println(stream.count());
        //System.out.println(stream.count()); RUNTIME ERROR
        
        //terminate
        System.out.println(stringList.stream().anyMatch(s -> s.isEmpty()));
        System.out.println(stringList.stream().findAny().get());
        System.out.println(stringList.stream().count());
        System.out.println(stringList.stream().distinct().count());
        System.out.println("-----------------------------");
        stringList.stream().forEachOrdered(s -> System.out.println(s));
        System.out.println("-----------------------------");
        stringList.stream().forEach(s -> System.out.println(s));
        
        System.out.println("-----------------------------");
        stringList1.stream().dropWhile(s -> s.equals(null)).forEach(s -> System.out.println(s));
        System.out.println("-----------------------------");
        
        System.out.println(stringList1.stream().filter(s-> s != null).limit(3).findFirst().get());
        System.out.println(stringList1.stream().equals(stringList1.stream()));
        stringList.stream().max((a, b) -> a.compareTo(b)).ifPresent(System.out::println);
        
    }
}



/*
 * Changes:
 * $Log: $
 */