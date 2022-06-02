/*
 * Collections.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.extra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
interface Collections<E>
{
    public boolean containsAll(Collection<?> c);
    public boolean addAll(Collection<? extends E> c); // Equivalent
    
    public <T> boolean containsAll1(Collection<T> c);
    public <T extends E> boolean addAll1(Collection<T> c); //Equivalent
    // Hey, type variables can have bounds too!
   
    public static <T> void copy(List<T> dest, List<? extends T> src){} // SHOULD USE
    public static <T, S extends T> void copy1(List<T> dest, List<S> src) {} //SHOULD NOT
    
    //static List<List<? extends Number>> history = new ArrayList<List<? extends Number>>();
    static List<? extends Number> history1 = new ArrayList<Number>();
    static List<List<? extends Number>> history2 = new ArrayList<List<? extends Number>>();
    static List<List<String>> history3 = new ArrayList<List<String>>();
    
    
    public default void drawAll(List<? extends Number> nums) {
        history2.add(nums);
    }
}



/*
 * Changes:
 * $Log: $
 */