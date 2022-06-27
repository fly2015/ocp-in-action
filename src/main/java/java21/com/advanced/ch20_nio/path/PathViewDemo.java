/*
 * PathViewDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PathViewDemo
{
    public static void main(String[] args)
    {
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: " + path);
        for (int i = 0; i < path.getNameCount(); i++)
        {
            System.out.println(" Element " + i + " is: " + path.getName(i));
        }
    }
}



/*
 * Changes:
 * $Log: $
 */