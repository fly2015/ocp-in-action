/*
 * OverloadGenerics.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch7_methods_and_encapsulation;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OverloadGenerics
{
    public void walk(List<String> strings) {}
    //public void walk(List<Integer> integers) {} // DOES NOT COMPILE COS "type erasure"
    
    /*
     * public void walk(List strings) {}
        public void walk(List integers) {} 
     */
}


/*
 * Changes:
 * $Log: $
 */