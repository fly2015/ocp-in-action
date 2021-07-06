/*
 * CollectionTester.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.collections;

import java.util.ArrayList;

import java21.com.inheritance.Product;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CollectionTester
{
    public static void main(String[] args)
    {
        Product p1 = new Product();
        Product p2 = new Product();
        
        ArrayList<Product> a1 = new ArrayList<Product>(4);
        a1.add(p1);
        a1.add(p2);
        a1.add(p1);
        System.out.println(a1.size());
        

        a1.remove(p1);// remove the lowest index
        a1.remove(p1);
        
        System.out.println(a1.size());
    }
}



/*
 * Changes:
 * $Log: $
 */