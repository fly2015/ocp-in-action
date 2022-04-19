/*
 * ForLoopTest.java
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
public class ForLoopTest
{
    public static void main(String[] args)
    {
        
        for (int i = 0; i < 10; i++)// braces is optional
            System.out.println(i);
         
        
        int stop = 0;
        PARENT_INFINITE_LOOP: for(int i = 0; i < 10;) 
        {
            System.out.println("I: " + i);
            for(;stop <=10; stop++)
            {
                System.out.println("Stop: " + stop);
                if(stop == 10)
                    break PARENT_INFINITE_LOOP; // break out of outer loop.
            }  
        }
           
    }
}



/*
 * Changes:
 * $Log: $
 */