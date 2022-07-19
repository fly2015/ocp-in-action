/*
 * ParallelStreamDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.paralellstream;

import java.util.Collection;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ParallelStreamDemo
{
    public static void main(String[] args)
    {
        Collection<Integer> c1 = List.of(1, 2, 10, 7);
        c1.stream().parallel().forEach(System.out::println);
        
        System.out.println("------------------------");
        c1.parallelStream().forEach(System.out::println);
        
        System.out.println("------------------------");
        c1.parallelStream().forEachOrdered(System.out::println);
    }
}



/*
 * Changes:
 * $Log: $
 */