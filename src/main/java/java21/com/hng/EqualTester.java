/*
 * EqualTester.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.hng;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class EqualTester
{
    public static void main(String[] args)
    {
        Product product1 = new Product(1, "A");
        Product product2 = product1;
        Product product3 = new Product(1, "A");
        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));
        
        List<Product> pList = new ArrayList<Product>();
        pList.add(product3);
        pList.add(product2);
        pList.add(product1);
        
        Product product4 = new Product(1, "A");
        System.out.println(pList.contains(product4));
        
        
        Set<Product> pSet = new HashSet<Product>();
        pSet.add(product1);
        pSet.add(product2);
        pSet.add(product3);
        
        System.out.println(pSet.size());
        System.out.println(pSet.contains(product4));
        
        String a = new String("b");
        String b = new String("b");
        
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a == b);

    }
}



/*
 * Changes:
 * $Log: $
 */