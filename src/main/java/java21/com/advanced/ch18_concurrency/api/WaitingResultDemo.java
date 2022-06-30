/*
 * WaitingResultDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class WaitingResultDemo
{
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException
    {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = null;
        try
        {
            future = executorService.submit(() -> {
                
                Thread.sleep(1000);
                return Integer.MAX_VALUE;
                
            });
        }
        finally
        {
            executorService.shutdown();
        }
        
        System.out.println(future.get());
    }
}



/*
 * Changes:
 * $Log: $
 */