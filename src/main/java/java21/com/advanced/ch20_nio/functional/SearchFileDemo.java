/*
 * SearchFileDemo.java
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
public class SearchFileDemo
{
    public static void main(String[] args) throws IOException
    {
        Path path = Paths.get("./how");
        Files.find(path, 10, (p, a) -> a.isRegularFile()).filter(p -> p.getFileName().toString().startsWith("mod")).forEach(System.out::println);
    }
}



/*
 * Changes:
 * $Log: $
 */