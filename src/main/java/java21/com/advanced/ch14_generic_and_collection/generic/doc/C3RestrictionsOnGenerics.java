/*
 * C3RestrictionsOnGenerics.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.doc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class C3RestrictionsOnGenerics
{
    // Cannot Instantiate Generic Types with Primitive Types
    // Cannot Create Instances of Type Parameters
    // Cannot Declare Static Fields Whose Types are Type Parameters
    // Cannot Use Casts or instanceof with Parameterized Types
    // Cannot Create Arrays of Parameterized Types
    // Cannot Create, Catch, or Throw Objects of Parameterized Types
    // Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type
    
    public static <E> void append(List<E> list) {
        //E elem = new E();  // compile-time error
        //list.add(elem);
    }
    
    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        E elem = cls.newInstance();   // OK
        list.add(elem);
    }
    
    static List<String> ls = new ArrayList<>();
    public static void main(String[] args)
    {
        append(ls);
    }
    public static void rtti(List<?> list) {
        if (list instanceof ArrayList<?>) {  // OK; instanceof requires a reifiable type
            // ...
        }
    }
    
    
    List<String> l1 = new ArrayList<>();
    ArrayList<String> l2 = (ArrayList<String>)l1;  // OK
    
    
    class Parser<T extends Exception> {
        public void parse(File file) throws T {     // OK
            // ...
        }
    }
}



/*
 * Changes:
 * $Log: $
 */