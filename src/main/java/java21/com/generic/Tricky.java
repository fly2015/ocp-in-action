/*
 * Tricky.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import java21.com.generic.sdo.Animal;
import java21.com.generic.sdo.Dog;

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
        Object x = l.get(0);
        
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
    }
}



/*
 * Changes:
 * $Log: $
 */