/*
 * StringBuilderDemo.java
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
public class StringBuilderDemo
{
    public static void main(String[] args)
    {
        System.out.println(new StringBuilder().append('a').append(false).append(new Object().toString()).toString());
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals-
        System.out.println(sb);
    }
}



/*
 * Changes:
 * $Log: $
 */