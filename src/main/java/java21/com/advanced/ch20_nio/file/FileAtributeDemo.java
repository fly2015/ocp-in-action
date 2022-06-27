/*
 * FileAtributeDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.file;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FileAtributeDemo
{
    public static void main(String[] args)
    {
        System.out.print(Files.isDirectory(Paths.get("/canine/fur. jpg")));
        System.out.print(Files.isSymbolicLink(Paths.get("/canine/coyote")));
        System.out.print(Files.isRegularFile(Paths.get("/canine/types.txt")));
    }
}



/*
 * Changes:
 * $Log: $
 */