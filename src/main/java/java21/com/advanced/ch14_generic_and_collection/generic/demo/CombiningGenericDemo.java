/*
 * CombiningGenericDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CombiningGenericDemo
{
    public static void main(String[] args)
    {
        List< ? > list1 = new ArrayList<A>();
        List< ? extends A> list2 = new ArrayList<A>();
        List< ? super A> list3 = new ArrayList<A>();
        
    }
    

    <B extends A> B third(List<B> list)
    {
        return null;
       // return new B(); // DOES NOT COMPILE
    }
}

class A {}
class B extends A {}
class C extends B {}


/*
 * Changes:
 * $Log: $
 */