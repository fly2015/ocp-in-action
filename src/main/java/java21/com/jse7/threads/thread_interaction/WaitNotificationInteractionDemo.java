/*
 * WaitNotificationInteractionDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.thread_interaction;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class WaitNotificationInteractionDemo
{
    public static void main(String[] args)
    {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b)
        {
            try
            {
                System.out.println(Thread.currentThread().getName() + " - Waiting for b to complete...");
                b.wait();
            }
            catch (InterruptedException e)
            {
            }
            System.out.println("Total is: " + b.total);
        }

    }

}



class ThreadB extends Thread
{
    int total;

    public void run()
    {
        synchronized (this)
        {
            for (int i = 0; i < 100; i++)
            {
                total += i;
            }
            System.out.println(Thread.currentThread().getName() + " -  Notified");
            notify();
        }
    }
}

/*
 * Changes:
 * $Log: $
 */