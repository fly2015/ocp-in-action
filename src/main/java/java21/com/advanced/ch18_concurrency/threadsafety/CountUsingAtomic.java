/*
 * CountUsingAtomic.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.threadsafety;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CountUsingAtomic
{
    private AtomicInteger count = new AtomicInteger(0);
    
    public void increaseCount()
    {
        System.out.println(count.incrementAndGet());
    }
    
    
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CountUsingAtomic  countUsingAtomic = new CountUsingAtomic();
        for (int i = 1; i <= 10; i++)
        {
            executorService.submit(() -> {
                countUsingAtomic.increaseCount();
            });
        }
        
        executorService.shutdown();
        
        boolean terminated = executorService.isTerminated();
        while (!terminated)
        {
            terminated = executorService.isTerminated();
        }
        
        System.out.println("The final result: " + countUsingAtomic.count);
    }
}



/*
 * Changes:
 * $Log: $
 */