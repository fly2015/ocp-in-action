/*
 * CopyFileDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CopyFileDemo
{
    public static void main(String[] args) throws IOException
    {
       
    }
    

    //Deep copy
    public void copyPath(Path source, Path target)
    {
        try
        {
            Files.copy(source, target);
            if (Files.isDirectory(source))
                try (Stream<Path> s = Files.list(source))
                {
                    s.forEach(p -> copyPath(p, target.resolve(p.getFileName())));
                }
        }
        catch (IOException e)
        {
            // Handle exception
        }
    }
}



/*
 * Changes:
 * $Log: $
 */