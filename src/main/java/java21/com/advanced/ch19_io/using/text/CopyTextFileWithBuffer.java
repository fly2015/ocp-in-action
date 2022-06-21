/*
 * CopyTextFileWithBuffer.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch19_io.using.text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
public class CopyTextFileWithBuffer
{
    void copyTextFileWithBuffer(File src, File dest) throws IOException
    {
        try (var reader = new BufferedReader(new FileReader(src));
             var writer = new BufferedWriter(new FileWriter(dest)))
        {
            String s;
            while ((s = reader.readLine()) != null)
            {
                writer.write(s);
                writer.newLine();
            }
        }
    }
}



/*
 * Changes:
 * $Log: $
 */