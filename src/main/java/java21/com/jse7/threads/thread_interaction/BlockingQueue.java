/*
 * ThreadInterationEmailProcessingConcurrentCollectionDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.thread_interaction;

import java.util.LinkedList;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class BlockingQueue
{
    private LinkedList<Object> queue = new LinkedList<>();
    private final int MAX_SIZE = 10;
    synchronized void enqueue(Object object)
    {
       // System.out.println(Thread.currentThread().getName() + " before ENqueue - size " + queue.size());
        while (queue.size() == MAX_SIZE)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        this.queue.add(object);
        System.out.println(Thread.currentThread().getName() + " - added " + object);

        if (queue.size() == 1)
        {
            notifyAll();
        }
    }
    
    
    synchronized Object dequeue()
    {
        //System.out.println(Thread.currentThread().getName() + " before Dequeue - size " + queue.size());
        while (queue.size() == 0)
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
        
        if(queue.size() == MAX_SIZE)
        {
            notifyAll();
        }
        
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return this.queue.removeFirst();
    }

    
    public static void main(String[] args)
    {
        BlockingQueue demo = new BlockingQueue();
        
        
        Thread th0 = new Thread(() -> {
            
            for (int i = 0; i < 30; i++)
            {
                demo.enqueue("OCP-" + i);
            }
        });
        
        Thread th1 = new Thread(() -> {

            while (true)
            {
                System.out.println(Thread.currentThread().getName() + " - " + demo.dequeue());
            }
        });
        
        
        Thread th2 = new Thread(() -> {
            while (true)
            {
                System.out.println(Thread.currentThread().getName() + " - " + demo.dequeue());
            }
        });
        
        
        th0.start();
        th1.start();
        th2.start();
    }
}



/*
 * Changes:
 * $Log: $
 */