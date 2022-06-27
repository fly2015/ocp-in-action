/*
 * PathCheckingTypeDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.path;

import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PathCheckingTypeDemo
{
    public static void main(String[] args)
    {
        var path1 = Paths.get("C:\\birds\\egret.txt");
        System.out.println("Path1 is Absolute? " + path1.isAbsolute());
        System.out.println("Absolute Path1: " + path1.toAbsolutePath());
        var path2 = Paths.get("birds/condor.txt");
        System.out.println("Path2 is Absolute? " + path2.isAbsolute());
        System.out.println("Absolute Path2 " + path2.toAbsolutePath());
    }
}



/*
 * Changes:
 * $Log: $
 */