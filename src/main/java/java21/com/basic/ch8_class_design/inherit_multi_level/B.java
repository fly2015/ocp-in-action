/*
 * B.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch_8_class_design.inherit_multi_level;

import java.io.IOException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class B extends A
{
    public static int sa = 10;
    public B(int y)
    {
        super(y);
    }
    
    public Number printI()
    {
        return 0;
    }
    
    public static Number printI(int i) throws IOException
    {
        return 100;
    }
}



/*
 * Changes:
 * $Log: $
 */