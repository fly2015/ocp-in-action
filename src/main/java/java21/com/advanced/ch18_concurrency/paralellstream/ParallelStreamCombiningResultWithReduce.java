/*
 * ParallelStreamCombiningResultWithReduce.java
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
public class ParallelStreamCombiningResultWithReduce
{
    public static void main(String[] args)
    {
        System.out.println(List.of("a", "x", "o", "n").parallelStream()
                           .reduce( (s1, c) -> s1 + c).get()); //
        
        
        final Character reduce = List.of('a', 'x', 'o', 'n').parallelStream().reduce('\u0000', (i, c) -> c);
        System.out.println(reduce);  
        
        
        final String reduce2 = List.of('a', 'x', 'o', 'n').parallelStream().reduce("", (i, c) -> i + c, (s1, s2) -> s1 + s2);
        System.out.println(reduce2);
        
        String i = "";
        i = i + 'a';
    }
}



/*
 * Changes:
 * $Log: $
 */