/*
 * B7ErasureOfGenericTypes1.java
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
public class B7ErasureOfGenericTypes1
{
    public class Node<T extends Number> {

        private T data;
        private Node<T> next;
        
        public Node()
        {
            
        }
        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() { return data; }
        // ...
    }
    
    /*************************
     * ===
     *  V
     *  V
     */
    public class Node_Erasure {

        private Object data;
        private Node next;

        public Node_Erasure(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() { return data; }
        // ...
    }
    
    public static void main(String[] args)
    {
        Node<Number> node = new B7ErasureOfGenericTypes1().new Node<Number>();
    }
    
}



/*
 * Changes:
 * $Log: $
 */