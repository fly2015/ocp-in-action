/*
 * OverLoadGenericMethodOfParent.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch7_methods_and_encapsulation;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OverLoadGenericMethodOfParent2
{

}


class LongTailAnimal1
{
    protected void chew(List<Object> input)
    {
    }
}


class Anteater1 extends LongTailAnimal1
{
    protected void chew(ArrayList<Double> input)
    {
        
    }
}

/*
 * Changes:
 * $Log: $
 */