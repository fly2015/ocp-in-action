/*
 * ParallelDecompositionDemo.java
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
public class ParallelDecompositionDemo
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        
        List.of(1,2,3,4,5).parallelStream()
                            .map(w -> doWork(w))
                            .forEachOrdered(s -> System.out.println(s + " "));
        
        var timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time: "+timeTaken+" seconds");
    }


    private static int doWork(int input)
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
        }
        return input;
    }
}



/*
 * Changes:
 * $Log: $
 */