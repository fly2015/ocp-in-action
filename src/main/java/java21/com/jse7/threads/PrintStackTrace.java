/*
 * PrintStackTrace.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PrintStackTrace
{
    public static void main(String[] args)
    {
        System.out.println(Integer.MAX_VALUE);
        Thread.currentThread();
        Thread.dumpStack();
    }
}



/*
 * Changes:
 * $Log: $
 */