/*
 * ConsumerDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.build_in;

import java.util.function.Consumer;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ConsumerDemo
{
    public static void main(String[] args)
    {
        Consumer<String> consumer = s -> System.out.println(s.length());
        consumer.andThen(s -> System.out.println(s.charAt(0))).andThen(s-> System.out.println(s.charAt(1))).accept("Hien");
        consumer.accept("HIen;");
    }
}



/*
 * Changes:
 * $Log: $
 */