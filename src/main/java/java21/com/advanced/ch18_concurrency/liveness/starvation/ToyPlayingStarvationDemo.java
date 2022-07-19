/*
 * ToyPlayingStarvationDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.liveness.starvation;

import java.util.concurrent.Executors;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ToyPlayingStarvationDemo
{
    /*
     * Two babies are playing toy(only one Train), the first one plays train and the second must waiting on until her/his turn, neither baby likes to share.
     * the first one is selfish, he keep the Train too long(all the play time), then the second one keep waiting on all playing time. Pure the second one
     */

    private static final Train train = new Train();
    
    public static void main(String[] args)
    {
        var executor = Executors.newFixedThreadPool(5);
        
        try
        {  
              Baby baby1 = new Baby("Baby1");
              Baby baby2 = new Baby("Baby2");
              executor.submit(() -> baby1.getTrain(train));
              executor.submit(() -> baby2.getTrain(train));
        }
        finally
        {
            executor.shutdown();
        }
        
        boolean terminated = executor.isTerminated();
        while(!terminated)
        {
            terminated = executor.isTerminated();
            System.out.println("There is one baby is keeping the Train. Another keep waiting.");
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

    public void getTrain(Train train)
    {
        synchronized (train)
        {
            System.out.println(Thread.currentThread().getName() + " - The baby " + this.name + " is holding the Train");
            keepPlayWithTrain();
        }
        
    }


    private void keepPlayWithTrain()
    {
        try
        {
            Thread.sleep(600000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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