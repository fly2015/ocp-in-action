/*
 * ParallelStream.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_15_functional.stream.parallel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ParallelStream
{
    public static void main(String[] args)
    {
        //List<String> list = Arrays.asList("A", "B", "C", "D");
        Iterable<String> list = Arrays.asList("A", "B", "C", "D");
        List<String> actualList = new ArrayList<String>();
        
        list.iterator().forEachRemaining(o -> actualList.add(o));
        StreamSupport
        .stream(list.spliterator(), false)
        .collect(Collectors.toList())
        .stream()
        
        //StreamSupport.stream(Spliterators.spliterator(list.iterator(), 1024, Spliterator.IMMUTABLE), true)
        //actualList.stream()
        .parallel()
        //.peek(o -> System.out.println(o))
        .map(o -> {
            System.out.println(o);
            try
            {
                Thread.sleep(3000);
                System.out.println("Done");
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            return o;
        }).forEach(o -> 
        {   
            //System.out.println(o);
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + o);
        }
        );
    }
}



/*
 * Changes:
 * $Log: $
 */