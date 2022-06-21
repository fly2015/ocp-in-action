/*
 * ConsoleDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch19_io.console;

import java.io.Console;
import java.io.IOException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ConsoleDemo
{
    public static void main(String[] args) throws IOException
    {
        Console console = System.console();
        if (console != null)
        {
            String userInput = console.readLine();
            console.writer().println("You entered: " + userInput);
        }
        else
        {
            System.err.println("Console not available");
        }
    }
}



/*
 * Changes:
 * $Log: $
 */