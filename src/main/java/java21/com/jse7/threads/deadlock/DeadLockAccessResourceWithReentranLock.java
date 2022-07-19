/*
 * DeadLockAccessResourceWithReentranLock.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.deadlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DeadLockAccessResourceWithReentranLock
{
    private String resourceA = new String("Resource A");
    private String resourceB = new String("Resource B");
    
    private ReentrantLock lock = new ReentrantLock();
    private ReentrantLock lock1 = new ReentrantLock();
    public String readResource()
    {
        try
        {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " locking on resource " + resourceA);
            System.out.println(Thread.currentThread().getName() + " locking on resource " + resourceB);
            try
            {
                lock1.lock();
                System.out.println(Thread.currentThread().getName() + " locking on resource " + resourceB);
            }
            finally
            {
                lock1.unlock();
            }
            
            
        }
        finally
        {
            lock.unlock();
        }
        
        
        
        System.out.println("Read DONE");
        return resourceA + resourceB;
    }
    
    public void writeResource()
    {
        try
        {
            lock1.lock();
            System.out.println(Thread.currentThread().getName() + " locking on resource " + resourceB);
            
            try
            {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + " locking on resource " + resourceA);
            }
            finally
            {
                lock.unlock();
            }
        }
        finally
        {
            lock1.unlock();
        }
        
       
        System.out.println("Write DONE");
    }
    
    public static void main(String[] args)
    {
        DeadLockAccessResourceWithReentranLock deadLockAccessResource = new DeadLockAccessResourceWithReentranLock();
        Thread th0 = new Thread(() -> deadLockAccessResource.readResource());
        Thread th1 = new Thread(() -> deadLockAccessResource.writeResource());
        
        th0.start();
        th1.start();
    }
}



/*
 * Changes:
 * $Log: $
 */