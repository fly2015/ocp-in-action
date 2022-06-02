/*
 * CheckedExceptionHandler.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.exception;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;


/**
 * @author nhqhien
 * @version $Revision: $
 */
public class CheckedExceptionHandler
{
    public void bad() throws IOException
    {
        //Supplier<List<String>> s = ExceptionCaseStudy::create; // DOES NOT COMPILE
    }   
    
    public static void main(String[] args)
    {
        Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;
    }
}


class ExceptionCaseStudy
{
    static List<String> create() throws IOException
    {
        throw new IOException();
    }
    

     static List<String> createSafe()
    {
        try
        {
            return ExceptionCaseStudy.create();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
     

     public void ugly()
     {
         Supplier<List<String>> s = () -> {
             try
             {
                 return ExceptionCaseStudy.create();
             }
             catch (IOException e)
             {
                 throw new RuntimeException(e);
             }
         };
     }
     
}

/*
 * Changes:
 * $Log: $
 */