/*
 * PathAccessingDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.path;

import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PathAccessingDemo
{
    public static void main(String[] args)
    {
        printPathInformation(Path.of("zoo"));
        printPathInformation(Path.of("/zoo/armadillo/shells.txt"));
        printPathInformation(Path.of("./armadillo/../shells.txt"));
    }
    public static void printPathInformation(Path path)
    {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println(" Root is: " + path.getRoot());
        Path currentParent = path;
        while ((currentParent = currentParent.getParent()) != null)
        {
            System.out.println(" Current parent is: " + currentParent);
        }
    }

}



/*
 * Changes:
 * $Log: $
 */