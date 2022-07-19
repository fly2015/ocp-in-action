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
public class WaitNotificationInteractionDemo3
{
    
    public static void main(String[] args)
    {
        Caculator1 caculator = new Caculator1();
        
        Thread th0 = new Thread(() -> caculator.run());
        th0.start();
        
        Thread th1= new Thread(() -> System.out.println(Thread.currentThread().getName() + " - Total: "  + caculator.getTotal()));
        th1.start();
    }
}



class Caculator1
{
    int total;
    private static volatile boolean isDone = false;

    public void run()
    {
        synchronized (this)
        {
            try
            {
                System.out.println(Thread.currentThread().getName() + " -  Waiting the get result trigger.");
                this.wait(); // wait for the checking total thread already run or not?
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            for (int i = 0; i < 100; i++)
            {
                total += i;
            }
            
            isDone = true;
            this.notify();
            System.out.println(Thread.currentThread().getName() + " -  Notified to get result.");
        }
    }
    
    
    public int getTotal()
    {
        synchronized (this)
        {
            if (!isDone) // if the result is not ready -> notify the run thread
            {
                this.notify();
                System.out.println(Thread.currentThread().getName() + " -  Notified To Runner.");
            }
           
            try
            {
                System.out.println(Thread.currentThread().getName() + " -  Waiting the Runner done its job.");
                this.wait(); //put the current thread on wait.
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            return total;
        }
    }
}

/*
 * Changes:
 * $Log: $
 */