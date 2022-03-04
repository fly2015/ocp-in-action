/*
 * FilesDeepCopy.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_20_nio;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
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
public class FilesDeepCopy
{
    public static void main(String[] args) throws IOException
    {
        Path source = Paths.get(System.getProperty("user.dir"), "//src//main//resources" + "//data");
        //Files.list(source).forEach(System.out::println);
        //copyPath(source, Path.of("how", "dataCopy"));
        Files.walk(source, FileVisitOption.FOLLOW_LINKS).forEach( p ->
        {
            try
            {
                Files.copy(p, Path.of("how", p.getFileName().toString()));
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        });
    }
    
    static void copyPath(Path source, Path target)
    {
        try
        {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            if (Files.isDirectory(source))
                try (Stream<Path> s = Files.list(source))
                {
                    s.forEach(p -> copyPath(p, target.resolve(p.getFileName())));
                }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    /*
     * 1. Sallow copy directory <data> to <dataCopy> -> create <dataCopy> folder. R1
     * 2. <data> is a folder -> get list of paths: <data/subdata> and <data/test.txt> R1
     * 3. Sallow copy <data/subdata> -> to <dataCopy/subdata> R2
     * 4. <data/subdata> -> is a folder -> get list of paths: <subdata/a.txt> R2 LOOP
     * 5. Sallow copy <data/subdata/a.txt> -> to <dataCopy/subdata/a.txt> R3 -> is a file -> END R3
     * 6. back to R1 loop: copy <data/test.txt> -> to <to <dataCopy/subdata/test.txt> -> is a file - END R1 
     * 
     */
}



/*
 * Changes:
 * $Log: $
 */