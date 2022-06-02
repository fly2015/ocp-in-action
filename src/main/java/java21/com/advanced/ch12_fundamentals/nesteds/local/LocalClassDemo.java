/*
 * LocalClassDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.nesteds.local;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class LocalClassDemo
{
    private int x = 20;
    private static int y;
    private static final int z = 10;
    
    public int getValue()
    {
        x = 20;
        //static final String s = new String("");
        abstract class LocalClass
        {
            private int f = 10;
            public int getFX()
            {
                return x + f;
            }
        }

        
        final LocalClass localClass = new LocalClass()
        {
            
        };
        return localClass.getFX();

    }
    
    static int getST()
    {
        class LocalClass
        {
            private int f = 10;
            public int getFX()
            {
                return f;
            }
        }
        
        LocalClass y = new LocalClass();
        return y.getFX();
    }
    
    public static void main(String[] args)
    {
        System.out.println(new LocalClassDemo().getValue());
    }
}



/*
 * Changes:
 * $Log: $
 */