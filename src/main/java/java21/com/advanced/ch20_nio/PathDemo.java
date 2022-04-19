/*
 * PathDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PathDemo
{
    public static void main(String[] args)
    {
        Path absolutePath = Paths.get("/zoom/ ../home").getParent().normalize().toAbsolutePath();
        System.out.println(absolutePath);
    }
}



/*
 * Changes:
 * $Log: $
 */