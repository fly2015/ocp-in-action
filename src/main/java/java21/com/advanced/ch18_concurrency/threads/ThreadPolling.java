/*
 * ThreadPolling.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch18_concurrency.threads;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ThreadPolling
{
    private static int counter = 0;
    public static void main(String[] args)
    {
        final var mainThread = Thread.currentThread();
        new Thread(() -> {
            for (int i = 0; i < Integer.MAX_VALUE; i++)
                counter++;
            mainThread.interrupt();
        }).start();
        
        while (counter < Integer.MAX_VALUE)
        {
            try
            {
                Thread.sleep(1_00000); // 1 SECOND
                System.out.println("Not reached yet");
            }
            catch (InterruptedException e)
            {
                System.out.println("Interrupted!");
            }
            
        }
        System.out.println("Reached: " + counter);
    }
}



/*
 * Changes:
 * $Log: $
 */