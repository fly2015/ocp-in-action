/*
 * A1GenericTypes.java
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
public class A1GenericTypes
{   
    //A generic type is a generic class or interface that is parameterized over types.
    //
    /**
     * Generic version of the Box class.
     * @param <T> the type of the value being boxed
     */
    public class Box<T> {
        // T stands for "Type"
        private T t;

        public void set(T t) { this.t = t; }
        public T get() { return t; }
    }
    
    /*
     * Type Parameter and Type Argument Terminology: Many developers use the terms "type parameter" and "type argument" interchangeably, but these terms are not the same. 
     * When coding, one provides type arguments in order to create a parameterized type. 
     * Therefore, the T in Foo<T> is a type parameter and the String in Foo<String> f is a type argument. 
     * This lesson observes this definition when using these terms.
     */
    
    Box<Integer> integerBox;
    /*
     * Like any other variable declaration, 
     * this code does not actually create a new Box object. 
     * It simply declares that integerBox will hold a reference to a "Box of Integer",
     *  which is how Box<Integer> is read.
     */
    
    
    public interface Pair<K, V> {
        public K getKey();
        public V getValue();
    }

    public class OrderedPair<K, V> implements Pair<K, V> {

        private K key;
        private V value;

        public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
        }

        public K getKey()   { return key; }
        public V getValue() { return value; }
    }
    
    //Multiple Type Parameters
    OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
    OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");
    
    //Parameterized Types
    OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>()); //NICE
    
}



/*
 * Changes:
 * $Log: $
 */