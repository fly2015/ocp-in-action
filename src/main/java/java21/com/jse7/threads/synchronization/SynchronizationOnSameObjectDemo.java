/*
 * SynchronizationOnSameObjectDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.synchronization;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SynchronizationOnSameObjectDemo
{
    public static void main(String[] args)
    {
        /*
         *  th0 acquired a Lock on object synchronizationDemo 
         *  and then sleep and hold the lock
         */
        SynchronizationOnSameObjectDemo synchronizationOnSameObjectDemo = new SynchronizationOnSameObjectDemo();
        Thread th0 = new Thread(() -> synchronizationOnSameObjectDemo.printA());
        th0.start();
        
        /*
         * th1 need to wait th1 release the lock of object synchronizationDemo, 
         * since both th1 and th2 are sync on the same object
         */
        Thread th1 = new Thread(() -> synchronizationOnSameObjectDemo.printB());
        th1.start();
        
        
        /*
         * th2 hold the lock of difference object then it no need to wait any one.
         */
        SynchronizationOnSameObjectDemo synchronizationOnSameObjectDemo1 = new SynchronizationOnSameObjectDemo();
        Thread th2 = new Thread(() -> synchronizationOnSameObjectDemo1.printC());
        th2.start();
    }
    
    synchronized void printA()
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
        System.out.println(Thread.currentThread().getName() +  "-Print A");
        
        printB();
    }
    
    
    synchronized void printB()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +  "-Print B");
    }
    
    
    synchronized void printC()
    {
        System.out.println(Thread.currentThread().getName() +  "-Print C");
    }
}



/*
 * Changes:
 * $Log: $
 */