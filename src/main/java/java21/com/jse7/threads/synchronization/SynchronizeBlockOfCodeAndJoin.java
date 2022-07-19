/*
 * SynchronizeBlockOfCodeAndJoin.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse7.threads.synchronization;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SynchronizeBlockOfCodeAndJoin
{
    public static void main(String[] args)
    {
        StringBuffer stringBuffer = new StringBuffer();
        CustomThread ct0 = new CustomThread(stringBuffer , "A");
        CustomThread ct1 = new CustomThread(stringBuffer , "B");
        CustomThread ct2 = new CustomThread(stringBuffer , "C");
        
        ct0.start();
        try
        {
            ct0.join();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ct1.start();
        try
        {
            ct1.join();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ct2.start();
    }
}

class CustomThread extends Thread
{
    private StringBuffer stringBuffer;
    private String letter;
    public CustomThread(StringBuffer stringBuffer, String letter)
    {
        this.stringBuffer = stringBuffer;
        this.letter = letter;
    }


    @Override
    public void run()
    {
        synchronized (stringBuffer)
        {
            for (int i = 0; i < 10; i++)
            {
                stringBuffer.append(letter);
            }
            System.out.println(stringBuffer.toString());
        }
    }
    
}



/*
 * Changes:
 * $Log: $
 */