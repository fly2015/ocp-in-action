/*
 * CountUsingSynchronization.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.synchronization;



/**
 * @author nhqhien
 * @version $Revision: $
 */
public class SynchronizatiInDifferentInstanceAndClassImproperly
{
    private volatile static int  count = 0; 
    public synchronized static void increaseCountA()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        for (int i = 0; i < 10; i++)
        {
            count = count + i;
        }
        
        
        System.out.println(Thread.currentThread().getName() + "-Count A: " + count);
    }
    
    
    public synchronized void increaseCountB()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++)
        {
            count = count + i;
        }
        System.out.println(Thread.currentThread().getName() + "-Count B: " + count);
    }


    public static void main(String[] args)
    {
        /*
         * th1 and th2 are synchronized improperly when accessing count
         * th1 and th2 can not block each other since the th0 is locking on the instance0 while the th1 are locking on SynchronizatiInDifferentInstanceAndClassImproperly class.
         */
        SynchronizatiInDifferentInstanceAndClassImproperly instance0 = new SynchronizatiInDifferentInstanceAndClassImproperly();
        Thread th0 = new Thread(() -> instance0.increaseCountB());
        
        Thread th1 = new Thread(() -> SynchronizatiInDifferentInstanceAndClassImproperly.increaseCountA());
        
        th0.start();
        th1.start();
        
        System.out.println("Main Done");
    }

}

/*
 * Changes:
 * $Log: $
 */