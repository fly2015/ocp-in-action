/*
 * WaitingAllTaskFinishDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


/**
 * @author nhqhien
 * @version $Revision: $
 */
public class WaitingAllTaskFinishDemo
{
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException
    {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Future<Integer>> listFuture = new ArrayList<Future<Integer>>();
        Collection<Callable<Integer>> listTask = new ArrayList<Callable<Integer>>();
        listTask.add(() -> {
            
            Thread.sleep(1000);
            return Integer.MAX_VALUE;
            
        });
        listTask.add(() -> Integer.MIN_VALUE);

        try
        {
            for (Callable<Integer> callable : listTask)
            {
                Future<Integer> future = executorService.submit(callable);
                listFuture.add(future);
            }
        }
        finally
        {
            executorService.shutdown();
        }
        
        executorService.awaitTermination(3, TimeUnit.SECONDS);
        if (executorService.isTerminated())
        {
            System.out.println("Finished!");
            for (Future<Integer> future : listFuture)
            {
                System.out.println(future.get());
            }
        }
        else
        {
            System.out.println("At least one task is still running");
        }
    }
}

/*
 * Changes:
 * $Log: $
 */