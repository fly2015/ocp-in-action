/*
 * PrimitiveFunctionalDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.build_in.primitive;

import java.util.function.DoubleToIntFunction;
import java.util.function.LongPredicate;
import java.util.function.ObjIntConsumer;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PrimitiveFunctionalDemo
{
    public static void main(String[] args)
    {
        DoubleToIntFunction f1 = a -> (int) a;
        System.out.println(f1.applyAsInt(1.0));
        
        
        LongPredicate p1 = a -> a>0;
        System.out.println(p1.test(10l));
        
        
        ObjIntConsumer<String> c1 = (s, i) -> System.out.println(s.length() + i);
        c1.accept("aaa", 1);
    }
}



/*
 * Changes:
 * $Log: $
 */