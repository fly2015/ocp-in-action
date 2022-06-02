/*
 * SupplierDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.build_in;

import java.util.Comparator;
import java.util.function.Predicate;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SupplierDemo
{
    public static void main(String[] args)
    {
        String abc = "HienNguyen";
        Predicate<String> predicate = a -> {return a.length() > 0;};
        boolean test = predicate.test(abc);
        System.out.println(test);
        
        Comparator<String> comparator = (String s3, String s4) -> {return s3.compareTo(s4);};
        System.out.println(comparator.compare("12344", "abc"));

    }
}



/*
 * Changes:
 * $Log: $
 */