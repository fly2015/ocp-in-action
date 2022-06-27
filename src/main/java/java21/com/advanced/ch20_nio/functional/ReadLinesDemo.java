/*
 * ReadLinesDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ReadLinesDemo
{
    public static void main(String[] args) throws IOException
    {
        Path path = Paths.get("./how/module.txt");
        try (var s = Files.lines(path))
        {
           // s.forEach(System.out::println);
        }
        
        
        //
        try (var s = Files.lines(path))
        {
            s.filter(f -> f.startsWith("javac")).forEach(System.out::println);
        }
    }
}



/*
 * Changes:
 * $Log: $
 */