/*
 * ThreadCreationDemo.java
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
public class ThreadCreationDemo
{
   

    public static void main(String[] args)
    {
        System.out.println("Start by thread: " + Thread.currentThread().getName());
        
        // 1. With Runnable lambda
        Thread t1 = new Thread(() -> {
            try
            {
                Thread.sleep(4000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Run with thread: " + Thread.currentThread().getName());
        });
        t1.start();
        
        // 2. With Thread instance
        Thread t2 = new CustomThread();
        t2.setDaemon(true);
        t2.start();
        System.out.println("End by thread: " + Thread.currentThread().getName());
    }
    
}

class CustomThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Run with thread: " + Thread.currentThread().getName());
    }
    
}



/*
 * Changes:
 * $Log: $
 */