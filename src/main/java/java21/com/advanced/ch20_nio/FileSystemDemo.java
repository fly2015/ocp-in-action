/*
 * FileSystemDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FileSystemDemo
{
    public static void main(String[] args) throws URISyntaxException
    {
        FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
        Path path = fileSystem.getPath("duck.txt");
    }
}



/*
 * Changes:
 * $Log: $
 */