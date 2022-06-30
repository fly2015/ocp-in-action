/*
 * ExecutorServiceWithCustomThreadFactoryDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.api;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ExecutorServiceWithCustomThreadFactoryDemo
{
    
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2, new CustomThreadFactory("OCP") );
        
        // Executes Runnable task at some point in future
        // and returns Future representing task.
        Future<Integer> future = executorService .submit(() -> {
            System.out.println(Thread.currentThread().getName());
            return Integer.MAX_VALUE;
        });
        
        boolean done = future.isDone();
        while (!done)
        {
            System.out.println(done);
            done = future.isDone();
        }
        
        if(done)
        {
            System.out.println(done);
            System.out.println(future.get()); 
        }
        
        executorService.shutdown();
    }
}


class CustomThreadFactory implements ThreadFactory
{
    private String prefix = "";
    public CustomThreadFactory(String prefix)
    {
        this.prefix = prefix;
    }
    /**
     * @see java.util.concurrent.ThreadFactory#newThread(java.lang.Runnable)
     */
    @Override
    public Thread newThread(Runnable r)
    {
        // TODO Auto-generated method stub
        return new Thread(r, this.prefix + "-" + Thread.currentThread().getName() + "-" + Thread.currentThread().getId());
    }

}
/*
 * Changes:
 * $Log: $
 */