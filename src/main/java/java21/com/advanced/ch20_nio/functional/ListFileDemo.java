/*
 * ListFileDemo.java
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
public class ListFileDemo
{
    public static void main(String[] args) throws IOException
    {
        //LISTING DIRECTORY CONTENTS
        try (Stream<Path> s = Files.list(Path.of("./")))
        {
            s.forEach(System.out::println);
        }
    }
}



/*
 * Changes:
 * $Log: $
 */