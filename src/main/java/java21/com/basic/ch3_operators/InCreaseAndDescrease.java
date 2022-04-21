/*
 * InCreaseAndDescrease.java
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
public class InCreaseAndDescrease
{
    public static void main(String[] args)
    {
        int lion = 3;
        int tiger = ++lion * 5 / lion--;
        System.out.println("lion is " + lion);
        System.out.println("tiger is " + tiger);
    }
}



/*
 * Changes:
 * $Log: $
 */