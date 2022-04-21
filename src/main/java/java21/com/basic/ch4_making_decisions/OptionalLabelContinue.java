/*
 * OptionalLabelContinue.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch4_making_decisions;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OptionalLabelContinue
{
    public static void main(String[] args)
    {

        CLEANING: for (char stables = 'a'; stables <= 'd'; stables++)
        {
            for (int leopard = 1; leopard < 4; leopard++)
            {
                if (stables == 'b' || leopard == 2)
                {
                    continue CLEANING;
                }
                System.out.println("Cleaning: " + stables + "," + leopard);
            }
        }
    }

}



/*
 * Changes:
 * $Log: $
 */