/*
 * FileLastModifiedTimeDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.file;

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
public class FileLastModifiedTimeDemo
{
    public static void main(String[] args) throws IOException
    {
        final Path path = Paths.get("/rabbit/food.jpg");
        long millis = Files.getLastModifiedTime(path).toMillis();
        System.out.println(millis);
    }
}



/*
 * Changes:
 * $Log: $
 */