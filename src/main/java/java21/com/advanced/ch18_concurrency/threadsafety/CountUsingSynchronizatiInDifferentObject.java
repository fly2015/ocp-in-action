/*
 * CountUsingSynchronization.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.threadsafety;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @author nhqhien
 * @version $Revision: $
 */
public class CountUsingSynchronizatiInDifferentObject
{
    private static int count = 0;
    Object counter0 = new Object();
    Object counter1 = new Object();
    
    public void increaseCountA()
    {
        synchronized (this)
        {
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-Count A: " + ++count);
        }
        
    }
    
    
    public void increaseCountB()
    {
        synchronized (this)
        {
            System.out.println(Thread.currentThread().getName() + "-Count B: " + ++count);
        }
    }


    public static void main(String[] args)
    {
        //
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CountUsingSynchronizatiInDifferentObject counter = new CountUsingSynchronizatiInDifferentObject();
        


        executorService.submit(() -> {
            counter.increaseCountA();
        });

        executorService.submit(() -> {
            counter.increaseCountB();
        });

        
        CountUsingSynchronizatiInDifferentObject counter1 = new CountUsingSynchronizatiInDifferentObject();
        executorService.submit(() -> {
            counter1.increaseCountB();
        });
         

         
        
        executorService.shutdown();
        boolean terminated = executorService.isTerminated();
        while (!terminated)
        {
            terminated = executorService.isTerminated();
        }
        System.out.println("The final result: " + count);

    }

}

/*
 * Changes:
 * $Log: $
 */