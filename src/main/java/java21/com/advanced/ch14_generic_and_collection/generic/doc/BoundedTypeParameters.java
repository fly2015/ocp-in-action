/*
 * BoundedTypeParameters.java
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
public class BoundedTypeParameters
{
    // to restrict the types that can be used as type arguments in a parameterized type
    public class Box<T> {

        private T t;          

        public void set(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }

        public <U extends Number> void inspect(U u){
            System.out.println("T: " + t.getClass().getName());
            System.out.println("U: " + u.getClass().getName());
        }
    }
    
    public static void main(String[] args) {
        Box<Integer> integerBox = new BoundedTypeParameters(). new Box<Integer>();
        integerBox.set(new Integer(10));
       // integerBox.inspect("some text"); // error: this is still String!
    }
    
    /*
     * In addition to limiting the types you can use to instantiate a generic type, 
     * bounded type parameters allow you to invoke methods defined in the bounds
     */
    
    public class NaturalNumber<T extends Integer> {

        private T n;

        public NaturalNumber(T n)  { this.n = n; }

        public boolean isEven() {
            return n.intValue() % 2 == 0;
        }

        // ...
    }
}



/*
 * Changes:
 * $Log: $
 */