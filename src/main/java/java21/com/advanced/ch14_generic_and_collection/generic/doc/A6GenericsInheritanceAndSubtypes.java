/*
 * A6GenericsInheritanceAndSubtypes.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.doc;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */

// You can subtype a generic class or interface by extending or implementing it. 
// The relationship between the type parameters of one class or interface and the type parameters of another are determined by the extends and implements clauses.
public class A6GenericsInheritanceAndSubtypes
{
    public class Box<T> {
        // T stands for "Type"
        private T t;

        public void add(T t) { this.t = t; }
    }
    
   
    
    public static void main(String[] args)
    {
        Box<Number> box = new A6GenericsInheritanceAndSubtypes(). new Box<Number>();
        box.add(new Integer(10));   // OK
        box.add(new Double(10.1));  // OK
        
        Object ob = box;
        new A6GenericsInheritanceAndSubtypes().boxTest(new Object());
        new A6GenericsInheritanceAndSubtypes().boxTest(box);
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