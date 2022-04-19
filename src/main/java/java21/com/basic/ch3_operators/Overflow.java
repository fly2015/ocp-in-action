/*
 * Overflow.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch3_operators;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Overflow
{
    public static void main(String[] args)
    {
        System.out.print(2147483647+1); // -2147483648
        System.out.print(-2147483648); // -2147483648
    }
}



/*
 * Changes:
 * $Log: $
 */