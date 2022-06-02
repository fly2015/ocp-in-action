/*
 * DefaultMethodDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.nesteds;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DefaultMethodDemo
{
    public static void main(String[] args)
    {
        new Z().getX();
    }
}

interface X
{
    private static void getAny()
    {
        System.out.println("ANY");
    }
    
    default void getX()
    {
        getAny();
        get10();
        System.out.println("From Default X");
    }
    
    private void get10()
    {
        System.out.println("10 X");
    }
}

class Y implements X
{
    public void getX()
    {
        System.out.println("From Y");
    }
    
    public void getXFromX()
    {
       X.super.getX();
    }
}

class Z implements X
{
    

}


/*
 * Changes:
 * $Log: $
 */