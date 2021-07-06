/*
 * Waiter.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.threads;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Waiter extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Done");
        super.run();
    }
    
}



/*
 * Changes:
 * $Log: $
 */