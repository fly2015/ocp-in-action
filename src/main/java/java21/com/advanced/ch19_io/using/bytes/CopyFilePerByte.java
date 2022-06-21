/*
 * CopyFilePerByte.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch19_io.using.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CopyFilePerByte
{
    void copyFile(File src, File dest) throws IOException
    {
        try (var in = new FileInputStream(src); var out = new FileOutputStream(dest))
        {
            int b;
            while ((b = in.read()) != -1)
            {
                out.write(b);
            }
        }
    }
}



/*
 * Changes:
 * $Log: $
 */