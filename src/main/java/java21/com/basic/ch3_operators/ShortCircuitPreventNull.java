/*
 * SortCircuitPreventNull.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch3_operators;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ShortCircuitPreventNull
{
    class Duck
    {
        public int getAge()
        {
            return 0;
        }
    }
    
    public static void main(String[] args)
    {
        // ShortCircuitPreventNull shortCircuitPreventNull = new ShortCircuitPreventNull();
        Duck duck = new ShortCircuitPreventNull().new Duck();
        if (duck != null & duck.getAge() < 5)
        { // Could throw a NullPointerException
            // Do something
        }

        if (duck != null && duck.getAge() < 5)
        {
            // Do something
        }
    }
}



/*
 * Changes:
 * $Log: $
 */