/*
 * CountUsingSynchronizationSameObject.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.threadsafety;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CountUsingSynchronizationSameObject
{
    private static int count = 0;
    private static final Object object = new Object();

    public  void increaseCount()
    {
        synchronized(object)
        {
            System.out.println(count++);
        }
        
    }
    
    
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CountUsingSynchronizationSameObject  counter = new CountUsingSynchronizationSameObject();
        for (int i = 1; i <= 10; i++)
        {
            executorService.submit(() -> {
                counter.increaseCount();
            });
        }
        
        executorService.shutdown();
        
        boolean terminated = executorService.isTerminated();
        while (!terminated)
        {
            terminated = executorService.isTerminated();
        }
        
        System.out.println("The final result: " + count);
    }
}



/*
 * Changes:
 * $Log: $
 */