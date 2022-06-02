/*
 * AnonymousDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.nesteds.anonymous;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AnonymousDemo
{
    public String getValue()
    {
        X x = new X()
        {
            
            @Override
            String getValue()
            {
                return "ABC";
            }
        };
        
        return x.getValue();
    }
    
    public static void main(String[] args)
    {
        System.out.println(new AnonymousDemo().getValue());
    }
}

abstract class X
{
    abstract String getValue();
}


class Gorilla
{
    interface Climb
    {
    }

    Climb climbing = new Climb()
    {
        
    };
}


/*
 * Changes:
 * $Log: $
 */