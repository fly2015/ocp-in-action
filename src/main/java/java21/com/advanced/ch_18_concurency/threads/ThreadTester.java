/*
 * ThreadTester.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_18_concurency.threads;

import java.util.concurrent.TimeUnit;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ThreadTester
{
    public static void main(String[] args) throws InterruptedException
    {
        int th1CountFrom = 0;
        int th1Total = 3;
        Object obj = new Object();
        Runnable countTask1 = new CountTask(th1CountFrom, th1Total);
        Thread th1 = new Thread(countTask1);
       // Thread th2 = new Waiter();
       // th2.join();
        th1.start();
        th1.join();
        
        obj.wait();
        boolean isAlive = th1.isAlive();
        while (isAlive)
        {
           TimeUnit.SECONDS.sleep(1);
           System.out.println("Running");
           isAlive = th1.isAlive();
        }
       // th2.start();
        //Runnable countTask2 = new CountTask(th1CountFrom + th1Total, th1Total + th1Total);
        //countTask2.run();
        
        /*
         * while(th1.getState().equals(Thread.State.TERMINATED))
         * {
         * System.out.println(th1.getState());
         * }
         */
    }
}


/*
 * Changes:
 * $Log: $
 */