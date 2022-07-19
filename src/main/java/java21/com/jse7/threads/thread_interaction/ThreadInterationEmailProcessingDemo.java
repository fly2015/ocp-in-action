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
public class ThreadInterationEmailProcessingDemo
{
    private List<String> mailBox = Collections.synchronizedList(new ArrayList<>());
    private final int MAX_SIZE = 5;
    synchronized void deliveryMail()
    {
        while (true)
        {
            if (mailBox.size() == MAX_SIZE)
            {
                try
                {
                    System.out.println(Thread.currentThread().getName() + " - Deliver keep waiting.");
                    this.wait();
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            final String e = "OCP-" + Math.random();
            mailBox.add(e);
            this.notify();
            System.out.println(Thread.currentThread().getName() + " - Delivered emails. - " + e);
            
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
                    System.out.println(Thread.currentThread().getName() + " - Processcor keep waiting.");
                    this.notify();
                    this.wait();
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
            final Iterator<String> iterator = mailBox.iterator();
            while(iterator.hasNext())
            {
                System.out.println(Thread.currentThread().getName() + " - Processed emails - " + iterator.next());
                iterator.remove();
                
                try
                {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
 
            
        }
    }

    
    public static void main(String[] args)
    {
        ThreadInterationEmailProcessingDemo demo = new ThreadInterationEmailProcessingDemo();
        
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