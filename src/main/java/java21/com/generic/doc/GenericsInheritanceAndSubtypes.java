/*
 * GenericsInheritanceAndSubtypes.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.generic.doc;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class GenericsInheritanceAndSubtypes
{
    public class Box<T> {
        // T stands for "Type"
        private T t;

        public void add(T t) { this.t = t; }
    }
    
   
    
    public static void main(String[] args)
    {
        Box<Number> box = new GenericsInheritanceAndSubtypes(). new Box<Number>();
        box.add(new Integer(10));   // OK
        box.add(new Double(10.1));  // OK
    }
    
    //What type of argument does it accept?
    public void boxTest(Box<Number> n) { /* ... */ }
    public void boxTest(Object bObject) { /* ... */ }
    
    /*
     * Note: Given two concrete types A and B (for example, Number and Integer), 
     * MyClass<A> has no relationship to MyClass<B>, regardless of whether or not A and B are related.
     * The common parent of MyClass<A> and MyClass<B> is Object.
     * 
     */
}



/*
 * Changes:
 * $Log: $
 */