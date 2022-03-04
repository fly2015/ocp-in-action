/*
 * StaticVariableTest.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package hng;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class StaticVariableTest
{
    private static int num = 0;
    
    public static int getNum()
    {
        return num;
    }

    public static void setNum(int num)
    {
        StaticVariableTest.num = num;
    }

    
}



/*
 * Changes:
 * $Log: $
 */