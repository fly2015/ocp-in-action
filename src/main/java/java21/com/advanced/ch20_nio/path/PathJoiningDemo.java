/*
 * PathJoiningDemo.java
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
public class PathJoiningDemo
{
    public static void main(String[] args)
    {
        Path path1 = Path.of("/cats/../panther");
        Path path2 = Path.of("food");
        System.out.println(path1.resolve(path2));
        
        Path path3 = Path.of("/turkey/food");
        System.out.println(path3.resolve("/tiger/cage")); // /tiger/cage
        
        
        
        
        
        Path path4 = Path.of("/cats/panther/..");
        Path path5 = Path.of("./food.txt");
        System.out.println(path4.resolve(path5).normalize());
        
    }
}



/*
 * Changes:
 * $Log: $
 */