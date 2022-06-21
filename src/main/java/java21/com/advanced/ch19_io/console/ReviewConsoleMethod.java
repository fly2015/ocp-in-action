/*
 * ReviewConsoleMethod.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch19_io.console;

import java.io.Console;
import java.util.Arrays;


/**
 * @author nhqhien
 * @version $Revision: $
 */
public class ReviewConsoleMethod
{
    public static void main(String[] args)
    {
        Console console = System.console();
        if (console == null)
        {
            throw new RuntimeException("Console not available");
        }
        else
        {
            String name = console.readLine("Please enter your name:");
            console.writer().format("Hi %s", name);
            console.writer().println();
            console.format("What is your address? ");
            String address = console.readLine();
            char[] password = console.readPassword("Enter apassword " + "between %d and %d characters: ", 5, 10);
            char[] verify = console.readPassword("Enter the password again: ");
            console.printf("Passwords " + (Arrays.equals(password, verify) ? "match" : "do not match"));
        }
    }
}

/*
 * Changes:
 * $Log: $
 */