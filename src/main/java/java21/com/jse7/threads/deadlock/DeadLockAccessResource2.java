/*
 * DeadLock.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.deadlock;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DeadLockAccessResource2
{
    private static String resourceA = new String("Resource A");
    private static String resourceB = new String("Resource B");
    
    public String readResource()
    {
        synchronized (resourceA)
        {
            System.out.println(Thread.currentThread().getName() + " locking on resource resourceA");
            synchronized (resourceB)
            {
                System.out.println(Thread.currentThread().getName() + " locking on resource resourceB");
            }
        }
        
        System.out.println("Read DONE");
        return resourceA + resourceB;
    }
    
    public void writeResource()
    {
        synchronized (resourceB)
        {
            System.out.println(Thread.currentThread().getName() + " locking on resource resourceB");
            synchronized (resourceA)
            {
                System.out.println(Thread.currentThread().getName() + " locking on resource resourceA");
            }
        }
        System.out.println("Write DONE");
    }
    
    public static void main(String[] args)
    {
        DeadLockAccessResource2 deadLockAccessResource = new DeadLockAccessResource2();
        Thread th0 = new Thread(() -> deadLockAccessResource.readResource());
        
        DeadLockAccessResource2 deadLockAccessResource1 = new DeadLockAccessResource2();
        Thread th1 = new Thread(() -> deadLockAccessResource1.writeResource());
        
        th0.start();
        th1.start();
        
        System.out.println(deadLockAccessResource.resourceA == deadLockAccessResource1.resourceA);
    }
}



/*
 * Changes:
 * $Log: $
 */