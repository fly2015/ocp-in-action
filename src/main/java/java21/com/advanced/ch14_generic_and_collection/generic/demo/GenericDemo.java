/*
 * GenericDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.demo;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class GenericDemo<T>
{
    T t;
    
    T [] tarr;
    
    public GenericDemo(T t)
    {
        this.t = t;
        this.tarr = null;
    }
    
    
    public void print()
    {
        System.out.println(t.toString());
    }
    
    public static <U> void print1(U [] u)
    {
        System.out.println(u.toString());
    }
    
    public static void main(String[] args)
    {
        GenericDemo<String> genericDemo = new GenericDemo<String>("ABC");
        genericDemo.print();
        
        GenericDemo.<String[]>print1(null);
    }
}



/*
 * Changes:
 * $Log: $
 */