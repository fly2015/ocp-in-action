/*
 * WalkingDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class WalkingDemo
{
    public static void main(String[] args) throws IOException
    {
        WalkingDemo walkingDemo = new WalkingDemo();
        var size = walkingDemo.getPathSize(Path.of("./how"));
        System.out.println("Total Size: " + size);
        //System.out.format("Total Size: %.2f megabytes", (size/1000000.0));
    }
    

    private long getSize(Path p)
    {
        try
        {
            return Files.size(p);
        }
        catch (IOException e)
        {
            // Handle exception
        }
        return 0L;
    }


    public long getPathSize(Path source) throws IOException
    {
        try (var s = Files.walk(source))
        {
            return s.parallel().filter(p -> !Files.isDirectory(p)).mapToLong(this::getSize).sum();
        }
    }
}



/*
 * Changes:
 * $Log: $
 */