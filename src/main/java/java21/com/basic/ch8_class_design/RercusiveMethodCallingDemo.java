/*
 * RercusiveMethodCallingDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch8_class_design;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class RercusiveMethodCallingDemo
{
    public void a()
    {
        System.out.println("Call b");
        b();
    }

    public void b()
    {
        System.out.println("Call a");
        a();
    }
    
    public static void main(String[] args)
    {
        new RercusiveMethodCallingDemo().a();
    }
}



/*
 * Changes:
 * $Log: $
 */