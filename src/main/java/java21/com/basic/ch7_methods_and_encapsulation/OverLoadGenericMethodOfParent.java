/*
 * OverLoadGenericMethodOfParent.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch7_methods_and_encapsulation;

import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OverLoadGenericMethodOfParent
{

}


class LongTailAnimal
{
    protected void chew(List<Object> input)
    {
    }
}


class Anteater extends LongTailAnimal
{
    //protected void chew(List<Double> input){} // DOES NOT COMPILE
}

/*
 * Changes:
 * $Log: $
 */