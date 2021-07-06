/*
 * NestedContextTester.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.nesteds.test;

import java21.com.nesteds.staticnested.Outer;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class NestedContextTester extends Outer
{
    public void xxx(String[] args)
    {
        Outer outer = new Outer();
        Outer.Inner x = new Outer.Inner();
    }
}



/*
 * Changes:
 * $Log: $
 */