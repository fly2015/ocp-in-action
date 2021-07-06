/*
 * WildcardsAndSubtyping.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.generic.doc;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class WildcardsAndSubtyping
{
    public static void main(String[] args)
    {
        List<?> lAny = new ArrayList<>();
        List<Object> lObject = new ArrayList<Object>();
        
        // upper bound
        List<? extends Number> lNumberUpper = new ArrayList<Number>();
        List<Number> lNumberAlone = new ArrayList<Number>();
        List<? extends Integer> lIntegerUpper = new ArrayList<Integer>();
        List<Integer> lIntegerAlone = new ArrayList<Integer>();
        
        lAny = lObject;
        lAny = lNumberUpper;
        lAny = lNumberAlone;
        lAny = lIntegerUpper;
        lAny = lIntegerAlone;
        
        lNumberUpper = lIntegerUpper;
        lNumberUpper = lIntegerAlone;
        lNumberUpper = lNumberAlone; 
        
        lIntegerUpper = lIntegerAlone; 
        
        // lower bound
        List<? super Integer> lIntegers = new ArrayList<Integer>();
        List<? super Number> lNumbers = new ArrayList<Number>();
        // List<Number> lNumberAlone = new ArrayList<Number>();
        lNumbers = lNumberAlone;
        lIntegers = lNumbers;
        lIntegers = lObject;
        lAny = lNumbers;
        
        
        //lNumber = lNumberAlone;
        
        //
        List<? extends A> lAUpper = new ArrayList<A>();
        List<A> lAAlone = new ArrayList<A>();
        
        lAUpper = lAAlone;
        //lAAlone = lAUpper; DO NOT COMPILE
    }
    
    class A {
        
    }
    
    class B extends A
    {
        
    }
}



/*
 * Changes:
 * $Log: $
 */