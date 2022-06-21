/*
 * CopyFileWithBuffer.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch19_io.using.bytes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
public class CopyFileWithBuffer
{
    void copyFileWithBuffer(File src, File dest) throws IOException
    {
        try (var in = new BufferedInputStream(new FileInputStream(src)); 
                var out = new BufferedOutputStream(new FileOutputStream(dest)))
        {
            var buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0)
            {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
    }
}



/*
 * Changes:
 * $Log: $
 */