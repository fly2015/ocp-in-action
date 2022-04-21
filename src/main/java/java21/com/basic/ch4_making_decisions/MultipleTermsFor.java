/*
 * MultipleTermsFor.java
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
public class MultipleTermsFor
{
    public static void main(String[] args)
    {
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++)
        {
            System.out.print(y + " ");
        }
        System.out.print(x + " ");
    }
}



/*
 * Changes:
 * $Log: $
 */