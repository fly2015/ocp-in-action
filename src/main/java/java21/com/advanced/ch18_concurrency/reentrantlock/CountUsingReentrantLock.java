/*
 * CountUsingReentrantLock.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.reentrantlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CountUsingReentrantLock
{
    private static int count = 0;
    public void increaseCount()
    {
        //ReentrantLock lock = new ReentrantLock();
        ReentrantLock lock = new ReentrantLock(true);//fairness
        try
        {
            lock.lock();
            System.out.println(count++);
        }
        finally
        {
            lock.unlock();
        }
        
    }
    
    
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CountUsingReentrantLock  counter = new CountUsingReentrantLock();
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