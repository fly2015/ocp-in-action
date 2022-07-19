/*
 * CountUsingSynchronization.java
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
public class CountUsingSynchronization
{
    private volatile static int count = 0;
    public void increaseCount()
    {
        synchronized (this)
        {
            System.out.println(count++);
        }
    }
    
    
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CountUsingSynchronization  counter = new CountUsingSynchronization();
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