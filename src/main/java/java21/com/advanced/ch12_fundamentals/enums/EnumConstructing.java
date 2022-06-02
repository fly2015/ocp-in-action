/*
 * EnumConstructing.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.enums;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class EnumConstructing
{
    enum OnlyOne
    {
        ONCE(true),
        SECOND(true);
        private OnlyOne(boolean b)
        {
            System.out.print("constructing,");
        }
    }
    
    public static void main(String[] args)
    {
        System.out.print("begin,");
        OnlyOne firstCall = OnlyOne.ONCE; // prints constructing for contructing both enum values
        
        OnlyOne second = OnlyOne.SECOND; // No print
        System.out.print("end");
    }
}

/*
 * Changes:
 * $Log: $
 */