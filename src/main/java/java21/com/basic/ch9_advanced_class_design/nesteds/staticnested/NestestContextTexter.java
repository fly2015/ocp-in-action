/*
 * NestestContextTexter.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch9_advanced_class_design.nesteds.staticnested;


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