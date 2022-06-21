/*
 * ReadBytesDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch19_io.user;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ReadBytesDemo
{
    public static void main(String[] args) throws IOException
    {
        String resourcePath1 = "/data/test.txt";
        InputStream resourceStream = ReadBytesDemo.class.getResourceAsStream(resourcePath1);
        byte [] bytes = new byte[1024];
        bytes[0] = 'j';
        while (resourceStream.read(bytes, 1, 100) != -1)// offset
        {
            String str = new String(bytes, StandardCharsets.UTF_8);
            //System.out.println((char) bytes[1]);
            System.out.println(str);
        }
    }
}



/*
 * Changes:
 * $Log: $
 */