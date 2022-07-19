/*
 * SynchronizeListUsingDemoImproperly.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.thread_safe_classes_using;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SynchronizeListUsingDemoProperly
{
    final private List<String> names = Collections.synchronizedList(new LinkedList<>());
    
    public synchronized void addName(String name)
    {
        names.add(name);
    }
    
    public synchronized String removeFirst()
    {
        if (names.size() > 0)
        {
            return names.remove(0);
        }
        return null;
    }
    
    
    public static void main(String[] args)
    {
        SynchronizeListUsingDemoProperly usingDemo = new SynchronizeListUsingDemoProperly();
        usingDemo.addName("OCP");
        Thread th0 = new Thread(() -> System.out.println(usingDemo.removeFirst()));
        Thread th1 = new Thread(() -> System.out.println(usingDemo.removeFirst()));
        
        th0.start();
        th1.start();
    }
}



/*
 * Changes:
 * $Log: $
 */