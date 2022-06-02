/*
 * ErasureOfGenericTypes2.java
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
public class ErasureOfGenericTypes2
{
    public class Node<T extends Comparable<T>> {

        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() { return data; }
        // ...
    }
    
    
    public class Node_Erasure {

        private Comparable data;
        private Node next;

        public Node_Erasure(Comparable data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Comparable getData() { return data; }
        // ...
    }
    
}



/*
 * Changes:
 * $Log: $
 */