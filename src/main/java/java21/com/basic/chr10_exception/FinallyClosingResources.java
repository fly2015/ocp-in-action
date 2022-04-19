/*
 * FinallyClosingResources.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.chr10_exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FinallyClosingResources
{
    //automatic resource management - try with resources
    /*
     * Behind the scenes, the compiler replaces a try-withresources block with a try and finally block.
     *  We refer to this “hidden” finally block as an implicit finally block
        since it is created and used by the compiler automatically.
        You can still create a programmer-defined finally block
        when using a try-with-resources statement; just be aware
        that the implicit one will be called first.
        
        
        Remember that only a try-with-resources statement is
        permitted to omit both the catch and finally blocks. A
        traditional try statement must have either or both. You
        can easily distinguish between the two by the presence of
        parentheses, (), after the try keyword.
     */
    public void readFileWithAutoClosed()
    {
        try (FileInputStream file = new FileInputStream("myfile.txt"); )// last semicolon is optional
        {
            // process read file data
        }
        catch (Exception e)
        {
             e.printStackTrace();
        }
    }
    
    //manually resource management
    public void readFile(String file)
    {
        FileInputStream is = null;
        try
        {
            is = new FileInputStream("myfile.txt");
            // Read file data
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (is != null)
            {
                try
                {
                    is.close();
                }
                catch (IOException e2)
                {
                    e2.printStackTrace();
                }
            }
        }
    }
    
    
}



/*
 * Changes:
 * $Log: $
 */