/*
 * ReadObjectFromFile.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch19_io.serialization;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ReadObjectFromFile
{
    List<Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException
    {
        var gorillas = new ArrayList<Gorilla>();
        try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile))))
        {
            while (true)
            {
                var object = in.readObject();
                if (object instanceof Gorilla)
                    gorillas.add((Gorilla)object);
            }
        }
        catch (EOFException e)
        {
            // File end reached
        }
        return gorillas;
    }
}



/*
 * Changes:
 * $Log: $
 */