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
public class SynchronizatiInDifferentInstanceImproperly
{
    private volatile static int  count = 0; 
    public void increaseCountA()
    {
        synchronized (this)
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
        
    }


    public static void main(String[] args)
    {
        SynchronizatiInDifferentInstanceImproperly instance0 = new SynchronizatiInDifferentInstanceImproperly();
        Thread th0 = new Thread(() -> instance0.increaseCountA());
        
        SynchronizatiInDifferentInstanceImproperly instance1 = new SynchronizatiInDifferentInstanceImproperly();
        Thread th1 = new Thread(() -> instance1.increaseCountA());
        
        /*
         * th1 and th2 can not block each other since the th0 and th1 are lock on difference instances
         */
        th0.start();
        th1.start();
        
        System.out.println("Main Done");
    }

}

/*
 * Changes:
 * $Log: $
 */