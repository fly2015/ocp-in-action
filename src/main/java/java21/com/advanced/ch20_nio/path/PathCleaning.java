/*
 * PathCleaning.java
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
public class PathCleaning
{
    public static void main(String[] args)
    {
        var p1 = Path.of("./armadillo/../shells.txt");
        System.out.println(p1.normalize()); // shells.txt
        var p2 = Path.of("/cats/../panther/food");
        System.out.println(p2.normalize()); // /panther/food
        var p3 = Path.of("../../fish.txt");
        System.out.println(p3.normalize()); // ../../fish.txt
        
        
        var p11 = Paths.get("/pony/../weather.txt");
        var p22 = Paths.get("/weather.txt");
        System.out.println(p1.equals(p2));
        // false
        System.out.println(p11.normalize().equals(p22.normalize()));
        // true
    }
}



/*
 * Changes:
 * $Log: $
 */