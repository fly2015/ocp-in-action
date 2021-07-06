/*
 * NestestContextTexter.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.nesteds.staticnested;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class NestestContextTexter
{
    public void main(String[] args)
    {
        Outer outer = new Outer();
        Outer.Inner x = new Outer.Inner();
        //outer.main(null);
        Outer.main(null);
    }
}



/*
 * Changes:
 * $Log: $
 */