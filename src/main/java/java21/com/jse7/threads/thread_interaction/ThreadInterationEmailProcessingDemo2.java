/*
 * ThreadInterationEmailProcessingConcurrentCollectionDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.thread_interaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ThreadInterationEmailProcessingDemo2
{
    private List<String> mailBox = Collections.synchronizedList(new ArrayList<>());
   // private final int MAX_SIZE = 5;
    synchronized void deliveryMail()
    {
        while (true)
        {
            final String e = "OCP-" + Math.random();
            mailBox.add(e);
            this.notifyAll();
            System.out.println(Thread.currentThread().getName() + " - Delivered emails. - " + e);
            
            if (mailBox.size() > 0)
            {
                try
                {
                    this.wait();
                }
                catch (InterruptedException e1)
                {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }
    }
    
    
    synchronized void processMail()
    {
        while (true)
        {
            if (mailBox.isEmpty())
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
            
            
            final Iterator<String> iterator = mailBox.iterator();
            while (iterator.hasNext())
            {
                try
                {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " - Processed emails - " + iterator.next());
                iterator.remove();
                this.notifyAll();
            }
            
            
        }
    }

    
    public static void main(String[] args)
    {
        ThreadInterationEmailProcessingDemo2 demo = new ThreadInterationEmailProcessingDemo2();
        
        Thread th0 = new Thread(() -> demo.deliveryMail());
        Thread th1 = new Thread(() -> demo.processMail());
        Thread th2 = new Thread(() -> demo.deliveryMail());
        Thread th3 = new Thread(() -> demo.deliveryMail());
      
        th0.start();
        
        th1.start();
        th2.start();
        th3.start();
    }
}



/*
 * Changes:
 * $Log: $
 */