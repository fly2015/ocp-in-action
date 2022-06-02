/*
 * ReduceDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.stream.terminal;

import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ReduceDemo
{
    public static void main(String[] args)
    {
        List<String> list = List.of("Cool", "Finn", "MeoMuop");
        
        //
        list.stream().reduce((a, b) -> a+b).ifPresent(System.out::println);
        //
        String reduce = list.stream().reduce("Hien", (a, b) -> a+b);
        System.out.println(reduce);
        
        //
        Integer reduce2 = list.stream().reduce(1, (a, b) -> {return a * b.length();}, (a, b) -> a*b);
        System.out.println(reduce2);
    }
}



/*
 * Changes:
 * $Log: $
 */