/*
 * AvoidParallelStatefulStreams.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.paralellstream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AvoidParallelStatefulStreams
{
    public static void main(String[] args)
    {
        var list = addValues(IntStream.range(1, 11).parallel());
        System.out.print(list); // [6, 8, 10, 2, 4]
        
        list = addValuesBetter(IntStream.range(1, 11).parallel());
        System.out.print(list); 
    }
    public static List<Integer> addValues(IntStream source)
    {
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter(s -> s % 2 == 0)
            .forEach(i -> {data.add(i);}); // STATEFUL: DON'T DO THIS!
        return data;
    }
    

    public static List<Integer> addValuesBetter(IntStream source)
    {
        return source.filter(s -> s % 2 == 0).boxed().collect(Collectors.toList());
    }
}



/*
 * Changes:
 * $Log: $
 */