/*
 * ToyHoldingLiveLock.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.liveness.livelock;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;



/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ToyHoldingLiveLock
{
    /*
     * Two babies intent play toy(only one Train), either baby is polite, they yield to each others
     * As a result, no one hold the toy to play
     */
    
    private static final Train train = new Train();
    private static AtomicBoolean isHolding = new AtomicBoolean(false);
    public static void main(String[] args)
    {
        var executor = Executors.newFixedThreadPool(5);
        
        try
        {  
              Baby baby1 = new Baby("Baby1");
              Baby baby2 = new Baby("Baby2");
              executor.submit(() -> {baby1.getTrain(train, isHolding); });
              executor.submit(() -> baby2.getTrain(train, isHolding));
        }
        finally
        {
            executor.shutdown();
        }
        
        boolean terminated = executor.isTerminated();
        while(!terminated)
        {
            terminated = executor.isTerminated();
            System.out.println("Babies are yielding to each others.");
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Interrupted.");
            }
        }

    }
}

class Baby
{
    private final String name;
    public Baby(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }


    public void getTrain(Train train, AtomicBoolean isHolding)
    {
        while (!isHolding.get())
        {
            System.out.println(Thread.currentThread().getName() + " - The baby " + this.name + " says:  Please take the Train and play first.");
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        isHolding.set(true);
        System.out.println(Thread.currentThread().getName() + " - The baby " + this.name + " is holding the Train.");

    }

}

class Car
{
}

class Train
{
}



/*
 * Changes:
 * $Log: $
 */