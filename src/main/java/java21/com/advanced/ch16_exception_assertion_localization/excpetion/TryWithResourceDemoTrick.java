/*
 * TryWithResourceDemoTrick.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch16_exception_assertion_localization.excpetion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TryWithResourceDemoTrick
{
    static Path path;
    public static void main(String[] args) throws IOException
    {
       // Path path = null;
        var writer = Files.newBufferedWriter(path);
        writer.append("This write is permitted but a reallybad idea!");
        try (writer)
        {
            writer.append("Welcome to the zoo!");
        }
        writer.append("This write will fail!"); // IOException 
    }
}

/*
 * Changes:
 * $Log: $
 */