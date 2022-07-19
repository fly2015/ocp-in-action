/*
 * ThreadInterationEmailProcessingConcurrentCollectionDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.collection;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ThreadInterationEmailProcessingConcurrentCollectionDemo
{
    private CopyOnWriteArrayList<String> mailBox = new CopyOnWriteArrayList<>();

    void deliveryMail()
    {
        while (true)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e1)
            {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            final String e = "OCP-" + Math.random();
            mailBox.add(e);
            System.out.println(Thread.currentThread().getName() + " - Delivered emails. - " + e);
        }

    }
    
    
     void processMail()
    {
        while (true)
        {
            if (!mailBox.isEmpty())
            {
                for (String e : mailBox)
                {
                    System.out.println(Thread.currentThread().getName() + " - Processed emails - " + e);
                    mailBox.remove(e);
                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e1)
                    {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        }
    }

    
    public static void main(String[] args)
    {
        ThreadInterationEmailProcessingConcurrentCollectionDemo demo = new ThreadInterationEmailProcessingConcurrentCollectionDemo();
        
        Thread th0 = new Thread(() -> demo.deliveryMail());
        Thread th1 = new Thread(() -> demo.processMail());

      
        th0.start();
        th1.start();
    }
}



/*
 * Changes:
 * $Log: $
 */