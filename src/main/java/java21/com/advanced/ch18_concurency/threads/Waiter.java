/*
 * Waiter.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_18_concurency.threads;

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