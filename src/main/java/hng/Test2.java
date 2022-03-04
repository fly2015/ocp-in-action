/*
 * Test2.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package hng;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test2
{
    public static void main(String[] args) throws InterruptedException
    {
        StaticVariableTest.setNum(10);
        
        Thread.sleep(100000);
        System.out.println(StaticVariableTest.getNum());
    }
}



/*
 * Changes:
 * $Log: $
 */