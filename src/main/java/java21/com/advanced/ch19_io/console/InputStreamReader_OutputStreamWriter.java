/*
 * InputStreamReader_OutputStreamWriter.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch19_io.console;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InputStreamReader_OutputStreamWriter
{
    public static void main(String[] args) throws IOException
    {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("User input: " + reader.readLine());
        
        var writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.append("aaaaaaa");
        writer.newLine();
        writer.flush();
        
        try (var out = System.out)
        {
            out.println("Hello");
        }

        System.out.println("Not printed");//

    }
}



/*
 * Changes:
 * $Log: $
 */