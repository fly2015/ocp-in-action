/*
 * NioTester.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class NioTester
{
    public static void main(String[] args) throws IOException
    {
        FileSystem fs = FileSystems.getDefault();
        fs.getFileStores().forEach(s -> System.out.println(s.type() + ' ' + s.name()));
        fs.getRootDirectories().forEach(p -> System.out.println(p));
        System.out.println(fs.getSeparator());
        
        
        Path source = Path.of("how");
        //System.out.println(source.);
        
       // Files.list(source).forEach(p -> System.out.println(p.normalize()));
        //Files.walk(source).forEach(p -> System.out.println(p));
        
        
        
        Path backup = Path.of("./backup/");
     
        System.out.println("-------------------");
      //  System.out.println(backup.relativize(source));
        System.out.println("-------------------");
        try
        {
            Files.list(source).forEach(file -> {
                try
                {
                    Path resolve = backup.resolve(file);
                    if (!Files.exists(resolve.getParent()))
                    {
                        Files.createDirectories(resolve);
                    } 
                   
                    System.out.println(resolve);
                    Files.copy(file, resolve, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}



/*
 * Changes:
 * $Log: $
 */