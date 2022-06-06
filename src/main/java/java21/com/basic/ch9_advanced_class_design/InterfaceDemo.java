/*
 * InterfaceDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch9_advanced_class_design;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public interface InterfaceDemo
{
    List<String> ls = new ArrayList<String>();
    
    static void printSomething()
    {
        privatePrintSomething1();
    }
    
    default void doSomething()
    {
        privatePrintSomething();
        privatePrintSomething1();
    }
    
    private void privatePrintSomething()
    {
        System.out.println("Hello Private");
    }
    
    private static void privatePrintSomething1()
    {
        System.out.println("Hello Static Private");
    }
}




/*
 * Changes:
 * $Log: $
 */