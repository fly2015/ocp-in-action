/*
 * ConditionDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ConditionDemo
{
    Lock lock = new ReentrantLock();
    Condition blockingPoolA = lock.newCondition();
    Condition blockingPoolB = lock.newCondition();
    void doLock()
    {
        lock.lock();
        try
        {
            System.out.println(Thread.currentThread().getName() + " Start waiting A.");
            blockingPoolA.await(); // "wait" here
            // lock will be reacquired
            // work
            
            System.out.println(Thread.currentThread().getName() + " Awaken A");
            
            System.out.println(Thread.currentThread().getName() + " Start waiting B.");
            blockingPoolB.await();
            System.out.println(Thread.currentThread().getName() + " Awaken B");
        }
        catch (InterruptedException ex)
        {
            // interrupted during await()
        }
        finally
        { // to ensure we unlock
            lock.unlock(); // must manually release
        }
    }
    
    void doUnlock()
    {
        lock.lock();
        try
        {
            // work
            blockingPoolA.signalAll(); // wake all awaiting
            // threads
            System.out.println(Thread.currentThread().getName() + " Signaled A.");
            
            blockingPoolB.signalAll();
            System.out.println(Thread.currentThread().getName() + " Signaled B.");
        }
        finally
        {
            lock.unlock(); // now an awoken thread can run
        }
    }
    
    public static void main(String[] args) throws InterruptedException
    {
        ConditionDemo conditionDemo = new ConditionDemo();
        Thread th0 = new Thread((() -> conditionDemo.doLock()));
        th0.start();
        
        Thread th1 = new Thread((() -> conditionDemo.doUnlock()));
        Thread.sleep(2000);
        th1.start();
        
        Thread th2 = new Thread((() -> conditionDemo.doUnlock()));
        Thread.sleep(2000);
        th2.start();
    }
}



/*
 * Changes:
 * $Log: $
 */