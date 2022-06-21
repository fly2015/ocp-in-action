/*
 * A2RawTypes.java
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
public class A2RawTypes
{
    public class Box<T> {
        public void set(T t) { /* ... */ }
        // ...
    }
    
    
    
    void print()
    {
        Box<String> stringBox = new Box<>();//raw type
        Box rawBox = stringBox; // assign parameterized type to Rawtype is OK
        Box<Integer> intBox = rawBox;     // warning: unchecked conversion
        rawBox.set(8);  // warning: unchecked invocation to set(T)
    }

    
    //Unchecked Error Messages
    public class WarningDemo {
        public void main(String[] args){
            Box<Integer> bi;
            bi = createBox();
        }

         Box createBox(){
            return new Box();
        }
    }
    
}



/*
 * Changes:
 * $Log: $
 */