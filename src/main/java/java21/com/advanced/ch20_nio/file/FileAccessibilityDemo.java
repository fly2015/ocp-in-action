/*
 * FileAccessibilityDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FileAccessibilityDemo
{
    public static void main(String[] args) throws IOException
    {
        System.out.print(Files.isHidden(Paths.get("/walrus.txt")));
        System.out.print(Files.isReadable(Paths.get("/seal/baby.png")));
        System.out.print(Files.isWritable(Paths.get("dolphin.txt")));
        System.out.print(Files.isExecutable(Paths.get("whale.png")));
    }
}



/*
 * Changes:
 * $Log: $
 */