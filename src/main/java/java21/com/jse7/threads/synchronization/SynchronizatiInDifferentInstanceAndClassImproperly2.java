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
public class SynchronizatiInDifferentInstanceAndClassImproperly2
{
    private volatile int count = 0; 
    public synchronized static void increaseCountA(SynchronizatiInDifferentInstanceAndClassImproperly2 instance)
    {
        for (int i = 0; i < 10; i++)
        {
            instance.count = instance.count + i;
        }
        
        System.out.println(Thread.currentThread().getName() + "-Count A: " + instance.count);
    }
    
    
    public synchronized void increaseCountB()
    {
        for (int i = 0; i < 10; i++)
        {
            this.count = this.count + i;
        }
        
        System.out.println(Thread.currentThread().getName() + "-Count B: " + this.count);
    }


    public static void main(String[] args) throws InterruptedException
    {
        /*
         * th1 and th2 are synchronized improperly when accessing count
         * th1 and th2 can not block each other since the th0 is locking on the instance0 while the th1 are locking on SynchronizatiInDifferentInstanceAndClassImproperly class.
         */
        SynchronizatiInDifferentInstanceAndClassImproperly2 instance0 = new SynchronizatiInDifferentInstanceAndClassImproperly2();
        Thread th0 = new Thread(() -> instance0.increaseCountB());

        Thread th1 = new Thread(() -> SynchronizatiInDifferentInstanceAndClassImproperly2.increaseCountA(instance0));

        th0.start();
        th1.start();


        System.out.println("Main Done");
    }

}

/*
 * Changes:
 * $Log: $
 */