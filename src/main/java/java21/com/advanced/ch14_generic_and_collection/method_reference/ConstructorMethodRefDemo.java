/*
 * ConstructorMethodRefDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.method_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ConstructorMethodRefDemo
{
    public static void main(String[] args)
    {
        Supplier<List<String>> c1 = ArrayList::new;
        List<String> list = c1.get();
        list.add("abc");
    }
}



/*
 * Changes:
 * $Log: $
 */