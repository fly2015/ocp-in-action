/*
 * InterfaceClassic.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch8_class_design.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public interface InterfaceClassic
{
    int NUMBER = 10;// static final
    List<String> STRINGS = new ArrayList<String>();//static final
    
    default public void printName()
    {
        System.out.println("123456");
    }
    public static void main(String[] args)
    {
        STRINGS.add("abc");
    }
}

class Impl implements InterfaceClassic
{
    public static void main(String[] args)
    {
       InterfaceClassic ns  = new Impl();
       ns.printName();
    }
}

/*
 * Changes:
 * $Log: $
 */