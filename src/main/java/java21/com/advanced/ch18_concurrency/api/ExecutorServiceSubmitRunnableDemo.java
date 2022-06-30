/*
 * ExecutorServiceSubmitRunnableDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ExecutorServiceSubmitRunnableDemo
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try
        {
            Future< ? > submit = executorService.submit(() -> System.out.println(Thread.currentThread().getName() +  " Hien"));
            executorService.submit(() -> System.out.println(Thread.currentThread().getName() +  " Hello"));
            executorService.submit(() -> System.out.println(Thread.currentThread().getName() +  " Word"));
            
            boolean done = submit.isDone();
            while (!done)
            {
                done = submit.isDone();
            }
            
            System.out.println(submit.isDone());
        }
        finally
        {
            executorService.shutdown();
        }
    }
}



/*
 * Changes:
 * $Log: $
 */