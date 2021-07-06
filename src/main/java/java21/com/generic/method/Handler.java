/*
 * Handler.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.generic.method;

import java21.com.generic.sdo.Animal;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Handler
{
    public <T> T doSomething1(T t)
    {
        return t;
    }
    
    public <T extends Animal> T doSomething2(T t)
    {
        return t;
    }
    
    
}



/*
 * Changes:
 * $Log: $
 */