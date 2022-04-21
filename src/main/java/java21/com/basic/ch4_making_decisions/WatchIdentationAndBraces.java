/*
 * WatchIdentationAndBraces.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch4_making_decisions;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class WatchIdentationAndBraces
{
    public static void main(String[] args)
    { 
        int hourOfDay = 0, morningGreetingCount = 0;
        if (hourOfDay < 11)
            System.out.println("Good Morning");
            morningGreetingCount++; //trap here, it is always executed.
    }
}



/*
 * Changes:
 * $Log: $
 */