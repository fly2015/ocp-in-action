/*
 * SchedulingTasksDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.api;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SchedulingTasksDemo
{
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        
        //
        ScheduledFuture<Integer> schedule = newSingleThreadScheduledExecutor.schedule(() -> Integer.MAX_VALUE, 10, TimeUnit.SECONDS);
        System.out.println(schedule.getDelay(TimeUnit.SECONDS));
        System.out.println(schedule.get());
        
        // period + delay time after each execution
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(() -> System.out.println(Integer.MAX_VALUE), 0, 1000, TimeUnit.MILLISECONDS);
        
        //
        newSingleThreadScheduledExecutor.scheduleWithFixedDelay(() -> System.out.println(Integer.MAX_VALUE), 0, 1000, TimeUnit.MILLISECONDS);
    }
}



/*
 * Changes:
 * $Log: $
 */