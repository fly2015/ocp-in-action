/*
 * ServingFoodTableWithoutCyclicBarrier.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.cyclicbarrier;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ServingFoodTableWithoutCyclicBarrier
{
    private void cleanTable()
    {
        System.out.println("Cleaning table.");
    }
    
    private void putFoodOnTable()
    {
        System.out.println("Putting foot on table.");
    }
    
    public void serveFood()
    {
        cleanTable();
        putFoodOnTable();
    }
    
    public static void main(String[] args)
    {
        ServingFoodTableWithoutCyclicBarrier server = new ServingFoodTableWithoutCyclicBarrier();
        ExecutorService newWorkStealingPool = Executors.newFixedThreadPool(10);
        try
        {
            for (int i = 0; i < 10; i++)
            {
                newWorkStealingPool.submit(() -> server.serveFood());
            }
            
        }
        finally
        {
            newWorkStealingPool.shutdown();
        }
    }
}



/*
 * Changes:
 * $Log: $
 */