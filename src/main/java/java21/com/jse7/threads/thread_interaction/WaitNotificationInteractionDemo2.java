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
public class WaitNotificationInteractionDemo2
{
    public static void main(String[] args)
    {
        Caculator caculator = new Caculator();
        Thread th0 = new Thread(() -> caculator.run());
        th0.start();

        synchronized (th0)
        {
            try
            {
                System.out.println("Waiting for b to complete...");
                th0.wait();
            }
            catch (InterruptedException e)
            {
            }
            System.out.println(Thread.currentThread().getName() +  " - Total is: " + caculator.getTotal());
        }
    }

}



class Caculator
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
            
            System.out.println(Thread.currentThread().getName() +  " - Notified.");
            notify();
        }
    }
    
    
    public int getTotal()
    {
        return total;
    }
}

/*
 * Changes:
 * $Log: $
 */