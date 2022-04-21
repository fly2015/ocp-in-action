/*
 * OptionalLabelsBadIdea.java
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
public class OptionalLabelsBadIdea
{
    public static void main(String[] args)
    {
        int frog = 15;
        BAD_IDEA: if (frog > 10)
            EVEN_WORSE_IDEA:
            {
                frog++;
            }
    }
}



/*
 * Changes:
 * $Log: $
 */