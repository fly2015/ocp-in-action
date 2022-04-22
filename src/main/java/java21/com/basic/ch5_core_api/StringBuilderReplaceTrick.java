/*
 * StringBuilderReplaceTrick.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch5_core_api;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class StringBuilderReplaceTrick
{
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder("pigeon dirty");
       // builder.delete(3, 100);
        builder.replace(3, 100, "a");
        System.out.println(builder);
    }
}



/*
 * Changes:
 * $Log: $
 */