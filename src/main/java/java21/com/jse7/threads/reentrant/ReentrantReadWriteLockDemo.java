/*
 * ReentrantReadWriteLockDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.reentrant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ReentrantReadWriteLockDemo
{
    public static void main(String[] args)
    {
        MaxValueCollection maxValueCollection = new MaxValueCollection();
        
        for (int i = 0; i < 10; i++)
        {
            final int value = i;
            new Thread(() -> maxValueCollection.add(Integer.valueOf(value))).start();
        }
        
        Thread th = null;
        for (int i = 0; i < 11; i++)
        {
           th = new Thread(() -> System.out.println(maxValueCollection.findMax()));
           th.start();
        }
        
        try
        {
            th.join();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


class MaxValueCollection
{
    private List<Integer> integers = new ArrayList<>();
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public void add(Integer i)
    {
        rwl.writeLock().lock(); // one at a time
        try
        {
            integers.add(i);
        }
        finally
        {
            rwl.writeLock().unlock();
        }
    }


    public int findMax()
    {
        rwl.readLock().lock(); // many at once
        try
        {
            return Collections.max(integers);
        }
        finally
        {
            rwl.readLock().unlock();
        }
    }
}

/*
 * Changes:
 * $Log: $
 */