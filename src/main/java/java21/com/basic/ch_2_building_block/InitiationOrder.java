/*
 * InitiationOrder.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch_2_building_block;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InitiationOrder
{
    public InitiationOrder()
    {
        System.out.println("3");
    }
    
    {
        System.out.println("2");
    }
    
    static
    {
        System.out.println("1");
    }
    
    public static void main(String[] args)
    {
        new InitiationOrder();
    }
}



/*
 * Changes:
 * $Log: $
 */