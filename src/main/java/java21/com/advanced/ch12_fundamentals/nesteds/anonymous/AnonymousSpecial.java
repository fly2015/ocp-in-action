/*
 * AnonymousSpecial.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.nesteds.anonymous;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AnonymousSpecial
{
    public static void main(String[] args)
    {
        A a = new A()
        {
            @Override
            public void printName()
            {
                System.out.println("Override");
            }

        };
        
        a.printName();
    }
}

class A 
{
    void printName()
    {
        System.out.println(A.class.getSimpleName());
    }
}



/*
 * Changes:
 * $Log: $
 */