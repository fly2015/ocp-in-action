/*
 * FinallyTest.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.chr10_exception;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FinallyTest
{
    public static void main(String[] args)
    {
        try
        {
            int a = 0; // only in this scope
            //System.exit(0);
        } 
        catch (Exception e)
        {
            //  catch block is optional with finally.
        }
        finally
        {
            System.exit(0);
            System.out.println("Never be executed.");
        }
    }
}



/*
 * Changes:
 * $Log: $
 */