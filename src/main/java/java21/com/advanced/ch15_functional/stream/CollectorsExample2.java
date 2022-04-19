/*
 * CollectorsExample2.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CollectorsExample2
{
    public static void main(String[] args)
    {
        List<String> stringList1 = new ArrayList<String>();
        stringList1.add("1");
        stringList1.add(null);
        stringList1.add("ABCD");
        stringList1.add("222");
        stringList1.add("10");
        
        List<String> stringList2 = new ArrayList<String>();
        stringList2.add("1");
        stringList2.add(null);
        stringList2.add("ABCD");
        stringList2.add("222");
        stringList2.add("11");
        stringList2.add("12");
        
        // Create map: key -> count number of character item in the list; values: the value of item.
        stringList1.stream().filter(Objects::nonNull).collect(Collectors.toMap(String::length, s -> s)).forEach((k, v) -> System.out.println(k + ": " + v));
        stringList2.stream().filter(Objects::nonNull).collect(Collectors.toMap(String::length, s -> s, (k,v) -> k + ":" + v)).forEach((k, v) -> System.out.println(k + "; " + v));
        stringList2.stream().filter(Objects::nonNull).collect(Collectors.toMap(String::length, s -> s, (k, v) -> k + ":" + v, () -> new TreeMap<Integer, String>())).forEach((k, v) -> System.out.println(k + "; " + v));
    }
}



/*
 * Changes:
 * $Log: $
 */