/*
 * OverloadMethod.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch7_methods_and_encapsulation;

import java.io.IOException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OverloadMethod
{
    public int read(byte[] b) throws IOException
    {
        return 0;
    }
    
    public int read() throws IOException
    {
        return 0;
    }
}



/*
 * Changes:
 * $Log: $
 */