/*
 * FilesDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FilesDemo
{
    public static void main(String[] args) throws IOException
    {
        //Copying and Replacing Files
        Files.copy(Paths.get("book.txt"), Paths.get("movie.txt"), StandardCopyOption.REPLACE_EXISTING);
    
    
        
        //Copying Files with I/O Streams
        try (var is = new FileInputStream("source-data.txt"))
        {
            // Write stream data to a file
            Files.copy(is, Paths.get("/mammals/wolf.txt"));
        }
        Files.copy(Paths.get("/fish/clown.xsl"), System.out);
        
        
        //Copying Files into a Directory
        var file = Paths.get("food.txt");
        // var directory = Paths.get("/enclosure/food.txt");
        var directory = Paths.get("/enclosure").resolve(file.getFileName());
        Files.copy(file, directory);
    }
}



/*
 * Changes:
 * $Log: $
 */