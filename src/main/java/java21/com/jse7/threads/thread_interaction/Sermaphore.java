/*
 * Sermaphore.java
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
public class Sermaphore
{
    private boolean signal = false;
    
    synchronized void take()
    {
        signal = true;
        this.notify();
        System.out.println(Thread.currentThread().getName() + " -  Taken.");
    }
    
    
    synchronized void release()  
    {
       while(!signal)
       {
           try
           {
               this.wait();
           }
           catch (InterruptedException e)
           {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
       }
       
       System.out.println(Thread.currentThread().getName() + " -  Released.");
       signal = false;
    }
    
    public static void main(String[] args)
    {
        Sermaphore sermaphore = new Sermaphore();
        Thread th0 = new Thread(() -> sermaphore.take());
        Thread th1 = new Thread(() -> sermaphore.release());
        th0.start();
        th1.start();
    }
}



/*
 * Changes:
 * $Log: $
 */