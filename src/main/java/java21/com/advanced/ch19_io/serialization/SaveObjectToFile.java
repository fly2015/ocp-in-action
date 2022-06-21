/*
 * SaveObjectToFile.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch19_io.serialization;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SaveObjectToFile
{
    void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException
    {
        try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile))))
        {
            for (Gorilla gorilla : gorillas)
                out.writeObject(gorilla);
        }
    }
}

class Gorilla 
{
    
}



/*
 * Changes:
 * $Log: $
 */