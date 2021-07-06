/*
 * ThreadTester.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.threads;

import java.util.concurrent.TimeUnit;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ThreadLambdaTester
{
    public static void main(String[] args)
    {
        Runnable runnable = () -> {
           int count = 0;
            while (count <= 1000)
            {
                System.out.println(count);
                try
                {
                    TimeUnit.SECONDS.sleep(2);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                count++;
            }
            ;

        };
        
        Thread th1 = new Thread(runnable);
        th1.start();
    }
}



/*
 * Changes:
 * $Log: $
 */