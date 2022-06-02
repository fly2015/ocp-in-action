/*
 * CallingInterface.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch9_advanced_class_design;

import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CallingInterface
{
    public static void main(String[] args)
    {
        List<String> ls = InterfaceDemo.ls;
        ls.add("avc");
        System.out.println(ls.toString());
    }
}



/*
 * Changes:
 * $Log: $
 */