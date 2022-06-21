/*
 * ReadLinesDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch19_io.user;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * @author nhqhien
 * @version $Revision: $
 */
public class ReadLinesDemo
{
    public static void main(String[] args) throws IOException
    {
        // File file = new File(System.getProperty("user.dir") + "//data/test.txt");
        // FileSystems.getDefault().getPath("").toAbsolutePath()
        Path path = Paths.get(System.getProperty("user.dir"), "//src//main//resources" + "//data/test.txt");
        System.out.println(path.toString());

        // Read char
        FileReader reader = new FileReader(path.toFile());
        int ch;
        char[] chs = new char[1024];
        while ((ch = reader.read(chs)) != -1)
        {
            // System.out.println((char) ch);
            String str = String.copyValueOf(chs);
            // System.out.println(str);
        }
        reader.close();

        /*
         * Read lines
         */
        reader = new FileReader(path.toFile());
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null)
        {
            //System.out.println(line);
        }

        bufferedReader.close();
        
        // Auto close resource
        try(FileReader reader3 = new FileReader(path.toFile()); BufferedReader bufferedReader2 = new BufferedReader(reader3))
        {
           System.out.println(bufferedReader2.readLine());
        }
    }
}

/*
 * Changes:
 * $Log: $
 */