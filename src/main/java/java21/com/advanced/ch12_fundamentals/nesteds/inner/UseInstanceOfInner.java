/*
 * UseInstanceOfInner.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.nesteds.inner;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class UseInstanceOfInner
{

}


class Fox
{
    private class Den
    {
    }

    public void goHome()
    {
        new Den();
    }


    public static void visitFriend()
    {
        // new Den(); // DOES NOT COMPILE // Need access via an instance of classes
        new Fox(). new Den();
    }
}


class Squirrel
{
    public void visitFox()
    {
       // new Den(); // DOES NOT COMPILE // private + not inside the outer class
    }
}

/*
 * Changes:
 * $Log: $
 */