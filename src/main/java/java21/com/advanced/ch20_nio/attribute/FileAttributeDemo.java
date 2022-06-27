/*
 * FileAttributeDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.attribute;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FileAttributeDemo
{
    public static void main(String[] args) throws IOException
    {
        //Retrieving Attributes with readAttributes()
        var path = Paths.get("./how/module.txt");
        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Is a directory? " + data.isDirectory());
        System.out.println("Is a regular file? " + data.isRegularFile());
        System.out.println("Is a symbolic link? " + data.isSymbolicLink());
        System.out.println("Size (in bytes): " + data.size());
        System.out.println("Last modified: " + data.lastModifiedTime());
        
        //Modifying Attributes with getFileAttributeView()
        // Read file attributes
        BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        BasicFileAttributes attributes = view.readAttributes();
        // Modify file last modified time
        FileTime lastModifiedTime = FileTime.fromMillis(attributes.lastModifiedTime().toMillis() + 10_000);
        view.setTimes(lastModifiedTime, null, null);
        
        data = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Last modified: " + data.lastModifiedTime());
    }
}



/*
 * Changes:
 * $Log: $
 */