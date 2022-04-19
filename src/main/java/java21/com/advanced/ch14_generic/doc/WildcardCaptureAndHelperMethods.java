/*
 * WildcardCaptureAndHelperMethods.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic.doc;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class WildcardCaptureAndHelperMethods
{
    public class WildcardError
    {
        void foo(List< ? > i)
        {
           Object x = i.get(0);
           //i.set(0, x); //DO NOT COMPILE
        }
        
        void foo1(List<Object> i)
        {
            i.set(0, i.get(0));// COMPILE OK
        }
    }
    
    public class WildcardFixed {

        void foo(List<?> i) {
            fooHelper(i);
        }


        // Helper method created so that the wildcard can be captured
        // through type inference.
        private <T> void fooHelper(List<T> l) {
            T element = l.get(0);
            l.set(0, element);
            System.out.println("Here");
        }

    }
    
    
    public class WildcardErrorBad {

        void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
          Number temp = l1.get(0);
          Number number = l2.get(0);
          //l1.set(0, number);  // DO NOT COMPILE 
                                 // expected a CAP#1 extends Number,
                                // got a CAP#2 extends Number;
                                // same bound, but different types
          //l2.set(0, temp);    // DO NOT COMPILE 
                                  // expected a CAP#1 extends Number,
                                // got a Number
        }
    }
    
    public static void main(String[] args)
    {
        WildcardFixed wildcardFixed = new WildcardCaptureAndHelperMethods().new WildcardFixed();
        List<Object> lNumbers = new ArrayList<Object>();
        lNumbers.add(10_00);
        lNumbers.add(null);
        lNumbers.add("ABC");
        List<?> lAny = new ArrayList<>();
        lAny = lNumbers;
        wildcardFixed.foo(lAny);
    }
}



/*
 * Changes:
 * $Log: $
 */