/*
 * CounTask.java
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
public class CountTask implements Runnable
{
    private int count;
    private int total;

    public CountTask(int count, int total)
    {
        this.count = count;
        this.total = total;
    }



    /**
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run()
    {
        while (count <= total)
        {
            System.out.println(count);
            try
            {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            count++;
        }
        
        return;
    }
}



/*
 * Changes:
 * $Log: $
 */