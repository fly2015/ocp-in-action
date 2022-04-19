/*
 * FilesCopyDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_20_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FilesCopyDemo
{
    public static void main(String[] args) throws IOException
    {
        Path source = Paths.get(System.getProperty("user.dir"), "//src//main//resources" + "//data");
        Files.copy(source, Path.of("how", "copiedTest"));
    }
}



/*
 * Changes:
 * $Log: $
 */