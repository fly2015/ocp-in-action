/*
 * Tricky.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_14_generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import java21.com.advanced.ch_14_generic.sdo.Animal;
import java21.com.advanced.ch_14_generic.sdo.Dog;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Tricky
{
    public static void main(String[] args)
    {
        //tricky 1
        List<Object> lo = new ArrayList<Object>();
        lo.add(new String("A"));
        lo.add(Integer.valueOf(10_00));
        
        //tricky 2
        List<Animal> la = new ArrayList<Animal>();
        la.add(new Dog());
        la.add(new Animal());
        
        //tricky 3
        List<Dog> ld = new ArrayList<Dog>();
        //List<Animal> lad = ld; // DO NOT COMPLIE
        
        // tricky 4
        Collection<?> c = new ArrayList<String>();
        c.add(null);
        
        // tricky 5
        List<?> l = new ArrayList<String>();
       // Object x = l.get(0);
        
        // tricky 6
        List<?> lany = new ArrayList<>();
        lany.add(null);
        List<Number> ln = new ArrayList<Number>();
        ln.add(10_00);
        
        List<Integer> li = new ArrayList<Integer>();
        ln.add(10_00);
        
        lany = ln;
        
        // tricky 7
        List<Number> lS = new ArrayList<Number>();
        lS.add(10_00);
        lS.add(Integer.valueOf(10));
        List<? extends Number> xx = new ArrayList<Number>();
        lS.addAll(xx);
        
        // tricky 7
        Map<String, Number> mapA = new HashMap<String, Number>();
        mapA.put("A", 10__00);
        mapA.put("B", 10.0_0d);
        
        Map<String, ? extends Number> mapB = new HashMap<String, Number>();
        mapA.putAll(mapB);
        mapB = mapA;
        
        // tricky 8
        List<Number> listA = new ArrayList<Number>();
        List<Integer> listC = new ArrayList<Integer>();
        
        Collection< ? extends Number> listB = new ArrayList<Number>();
        listA.addAll(listB);
        listA.addAll(listC);
        
        listB = listA;
        listB = listC;
        
        //tricky 9
        HashSet<? super Object> set = new HashSet<Object>();
        set.add(10);
        set.add(10L);
        set.add(new Object());
        
      
        
        List<? super ClassCastException> list1 = new ArrayList<Exception>();
        list1.add(new ClassCastException());
        //  list1.add(new Exception());
        List<? super Number> list2 = new ArrayList<Object>();
        List<? super Number> list3 = new ArrayList<Number>();
        list2.add(10);
        list2.add(10L);
        List<? extends Number> list4 = new ArrayList<Number>();
        Number number = list4.get(0);
        // list2.add(new Object());
        
        // tricky 10
        //List<Object> l1 = new ArrayList<? extends Object>(); -> BDO NOT COMPILE
    }
    
    public static void addAllDemo(List< ? extends Number> listB)
    {
        List<Number> listA = new ArrayList<Number>();
        listA.addAll(listB);
    }
    
    public static void putAllDemo(Map<String, ? extends Number> mapB)
    {
        Map<String, Number> mapA = new HashMap<String, Number>();
        mapA.putAll(mapB);
    }
}



/*
 * Changes:
 * $Log: $
 */