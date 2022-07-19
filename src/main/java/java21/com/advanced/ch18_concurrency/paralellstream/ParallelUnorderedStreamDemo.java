/*
 * ParallelUnorderedStreamDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.paralellstream;

import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ParallelUnorderedStreamDemo
{
    public static void main(String[] args)
    {
        List.of(1,2,3,4,5,6).stream().unordered().parallel().skip(3).forEach(n -> System.out.println(n));
        
        System.out.println("----------------------");
        
        List.of(1,2,3,4,5,6).stream().skip(3).forEach(n -> System.out.println(n));
    }
}



/*
 * Changes:
 * $Log: $
 */