/*
 * CopyTextFilePerCharacter.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch19_io.using.text;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CopyTextFilePerCharacter
{
    void copyTextFile(File src, File dest) throws IOException
    {
        try (var reader = new FileReader(src); 
                var writer = new FileWriter(dest))
        {
            int b;
            while ((b = reader.read()) != -1)
            {
                writer.write(b);
            }
        }
    }
}



/*
 * Changes:
 * $Log: $
 */