/*
 * ProtectedTrickiest.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch7_methods_and_encapsulation.access_modifier;

import java21.com.basic.ch7_methods_and_encapsulation.access_modifier.sdo.A;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ProtectedTrickiest
{
}

class B extends A
{
    public static void main(String[] args)
    {
        A a = new B();
        //  a.doST(); //-> trickiest, the protected methods only access inside package or by subclass reference
        
        B b = new B();
        b.doST();
    }
}



/*
 * Changes:
 * $Log: $
 */