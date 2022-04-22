/*
 * ComparatorDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch6_lamdas_functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ComparatorDemo
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("a", "c", "b");
        Comparator<String> comparator = (s1, s2) -> s2.compareTo(s1);
        Collections.sort(list, comparator);
        System.out.println(list.toString());
        
        List<String> list1 = Arrays.asList("a", "c", "b");
        Comparator<String> comparator1 = (s1, s2) -> - s1.compareTo(s2);
        Collections.sort(list1, comparator1);
        System.out.println(list1.toString());
    }
}



/*
 * Changes:
 * $Log: $
 */