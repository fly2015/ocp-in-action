/*
 * ParallelCombiningResultsWithCollect.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.paralellstream;

import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ParallelCombiningResultsWithCollect
{
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new,
        Set::add,
        Set::addAll);
        System.out.println(set); // [f, l, o, w]
    }
}



/*
 * Changes:
 * $Log: $
 */