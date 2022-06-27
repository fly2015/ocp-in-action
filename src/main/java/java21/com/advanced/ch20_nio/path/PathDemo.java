/*
 * PathDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.path;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PathDemo
{
    public static void main(String[] args) throws URISyntaxException
    {
        //Obtaining a Path from Path interface
        // Relative path
        Path path1 = Path.of("pandas/cuddly.png");
        // Absolute path Windows
        Path path2 = Path.of("c:\\zooinfo\\November\\employees.txt");
        // Absolute linux
        Path path3 = Path.of("/home/zoodirectory");
        
        // Obtaining a Path from Paths
        Path path11 = Paths.get("pandas/cuddly.png");
        Path path22 = Paths.get("c:\\zooinfo\\November\\employees.txt");
        Path path33 = Paths.get("/", "home", "zoodirectory");
        
        
        // Obtaining a Path from URI
        URI a = new URI("file://icecream.txt");
        Path b = Path.of(a);
        Path c = Paths.get(a);
        URI d = b.toUri();
        
        Path pornPath = Paths.get(new URI("https://www.pornhub.com"));
        Path path6 = Paths.get(new URI("ftp://username:secret@ftp.example.com"));
        
        // Obtaining a Path from FileSystems
        Path path111 = FileSystems.getDefault().getPath("pandas/cuddly.png");
        Path path222 = FileSystems.getDefault().getPath("c:\\zooinfo\\November\\employees.txt");
        Path path333 = FileSystems.getDefault().getPath("/home/zoodirectory");
        
        //Obtaining a Path from the java.io.File Class
        File file = new File("husky.png");
        Path path = file.toPath();
        File backToFile = path.toFile();
    }
}



/*
 * Changes:
 * $Log: $
 */