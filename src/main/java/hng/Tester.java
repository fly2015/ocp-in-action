/*
 * Tester.java
 *
 * All rights reserved.
 */
package hng;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Tester
{
    public void printSomething()
    {
        System.out.println(StringUtils.isNumeric("XXXXXXXXXXX"));
    }
    
    public static void main(String[] args)
    {
        new Tester().printSomething();
    }
}



/*
 * Changes:
 * $Log: $
 */