/*
 * ServingFoodTableWithCyclicBarrier.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ServingFoodTableWithCyclicBarrier
{
    private void cleanTable()
    {
        System.out.println("Cleaning table.");
    }
    
    private void inviteCustomer()
    {
        System.out.println("Inviting customer.");
    }
    
    private void orderFood()
    {
        System.out.println("Ordering food.");
    }
    
    private void cookFood()
    {
        System.out.println("Cooking food.");
    }
    
    private void serveFood()
    {
        System.out.println("Serving food.");
    }
    
    public void serveFood(CyclicBarrier cyclicBarrier1, CyclicBarrier cyclicBarrier2, CyclicBarrier cyclicBarrier3, CyclicBarrier cyclicBarrier4)
    {
        
        try
        {
            cleanTable();
            cyclicBarrier1.await();
            
            inviteCustomer();
            cyclicBarrier1.await();
            
            orderFood();
            cyclicBarrier1.await();
            
            cookFood();
            cyclicBarrier1.await();
            
            serveFood();
            
        }
        catch (InterruptedException | BrokenBarrierException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }
    
    public static void main(String[] args)
    {
        ServingFoodTableWithCyclicBarrier server = new ServingFoodTableWithCyclicBarrier();
        ExecutorService newWorkStealingPool = Executors.newFixedThreadPool(10);
        int barrierPoint = 4;
        CyclicBarrier cyclicBarrier1 = new CyclicBarrier(barrierPoint, () -> System.out.println("*** The table is cleaned ! Please invite customer !"));
        CyclicBarrier cyclicBarrier2 = new CyclicBarrier(barrierPoint, () -> System.out.println("*** Please help customer order food !"));
        CyclicBarrier cyclicBarrier3 = new CyclicBarrier(barrierPoint, () -> System.out.println("*** Customer odered food ! Please prepare food !"));
        CyclicBarrier cyclicBarrier4 = new CyclicBarrier(barrierPoint, () -> System.out.println("*** Food is ready ! Please serve customer !"));
        try
        {
            for (int i = 0; i < barrierPoint; i++)
            {
                newWorkStealingPool.submit(() -> server.serveFood(cyclicBarrier1, cyclicBarrier2, cyclicBarrier3, cyclicBarrier4));
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