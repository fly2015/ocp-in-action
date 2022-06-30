/*
 * ReentrantLockWithTryLock.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.reentrantlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ReentrantLockWithTryLock
{
    public static int count = 0;
    public static void main(String[] args)
    {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ReentrantLockWithTryLock counter = new ReentrantLockWithTryLock();
        try
        {
            ReentrantLock lock = new ReentrantLock();
            for (int i = 0; i < 100; i++)
            {
                newCachedThreadPool.execute(() -> {
                    try
                    {
                        //counter.increaseCount(); // wrong implementation
                        counter.increaseCountWithReenTratnLock(lock);
                    }
                    catch (InterruptedException e)
                    {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                });
            }
            
        }
        finally
        {
            newCachedThreadPool.shutdown();
        }
        
        
        boolean terminated = newCachedThreadPool.isTerminated();
        while (!terminated)
        {
            terminated = newCachedThreadPool.isTerminated();
        }
        
        System.out.println("The final result: " + count);
    }
    

    public void increaseCountWithReenTratnLock(ReentrantLock lock) throws InterruptedException
    {
        System.out.println(lock.hashCode());
        if (lock.tryLock(60, TimeUnit.SECONDS))
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(++count);
            }
            finally
            {
                lock.unlock();
            }
        }
        else
        {
            System.out.println("Unable to acquire lock, doing something else");
        }

    }
    
    
    public void increaseCount() throws InterruptedException
    {
        ReentrantLock lock = new ReentrantLock(true);
        System.out.println(lock.hashCode());
        if (lock.tryLock())
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(++count);
            }
            finally
            {
                lock.unlock();
            }
        }
        else
        {
            System.out.println("Unable to acquire lock, doing something else");
        }

    }
}



/*
 * Changes:
 * $Log: $
 */