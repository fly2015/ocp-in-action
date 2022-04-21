/*
 * OptionalLabelsForLoop.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch4_making_decisions;

import java.util.Iterator;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OptionalLabelsForLoop
{
    public static void main(String[] args)
    {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        OUTER_LOOP: for (int[] mySimpleArray : myComplexArray)
        {
            INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++)
            {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

    }
}



/*
 * Changes:
 * $Log: $
 */