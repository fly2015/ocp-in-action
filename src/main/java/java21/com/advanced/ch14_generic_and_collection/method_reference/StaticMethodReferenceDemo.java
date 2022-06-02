/*
 * StaticMethodReferenceDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.method_reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class StaticMethodReferenceDemo
{
    public static void main(String[] args)
    {
        var list = new ArrayList<String>();
        list.add("Z");
        list.add("1");
        list.add("a");
        
        Consumer<List<String>> c1 = Collections::sort;
        c1.accept(list);
        list.forEach(System.out::print);
    }
}



/*
 * Changes:
 * $Log: $
 */