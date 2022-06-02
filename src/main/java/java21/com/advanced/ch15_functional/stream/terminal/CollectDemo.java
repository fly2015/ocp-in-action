/*
 * CollectDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.stream.terminal;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CollectDemo
{
    public static void main(String[] args)
    {
        List<String> list = List.of("Cool", "Finn", "MeoMuop"); 
        
        // Collect to StringBuilder
        StringBuilder collect = list.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(collect);
        
        // Collect to ArrayList
        list.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll).forEach(System.out::println);
    }
}



/*
 * Changes:
 * $Log: $
 */