/*
 * CommandInjectionDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch22_sercurity;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CommandInjectionDemo
{
    public static void main(String[] args) throws IOException
    {
        Console console = System.console();
        String dirName = console.readLine();
        if (dirName.equals("mammal") || dirName.equals("birds")) // use whitelist to prevent expose others path from malicious path
        {
            Path path = Paths.get("c:/data/diets/" + dirName);
            try (Stream<Path> stream = Files.walk(path))
            {
                stream.filter(p -> p.toString().endsWith(".txt")).forEach(System.out::println);
            }
        }
    }
}



/*
 * Changes:
 * $Log: $
 */