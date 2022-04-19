/*
 * GenericMethods.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic.doc;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class GenericMethods
{
    public static class Util {
        public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
            return p1.getKey().equals(p2.getKey()) &&
                   p1.getValue().equals(p2.getValue());
        }
    }
    
    public class Pair<K, V> {

        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public void setKey(K key) { this.key = key; }
        public void setValue(V value) { this.value = value; }
        public K getKey()   { return key; }
        public V getValue() { return value; }
    }
    
    
    Pair<Integer, String> p1 = new Pair<>(1, "apple");
    Pair<Integer, String> p2 = new Pair<>(2, "pear");
    
    //The complete syntax for invoking this method would be:
    boolean same = Util.<Integer, String>compare(p1, p2);
    
    // the compiler will infer the type that is needed
    boolean same1 = Util.compare(p1, p2);
    /*
     * This feature, known as type inference, 
     * allows you to invoke a generic method as an ordinary method, 
     * without specifying a type between angle brackets.
     */
}



/*
 * Changes:
 * $Log: $
 */