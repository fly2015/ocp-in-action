/*
 * GenericClassesAndSubtyping.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic.doc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class GenericClassesAndSubtyping
{
    /*
     * So long as you do not vary the type argument,
     *  the subtyping relationship is preserved between the types.
     */
    void illustrate() {
        Collection<Number> cN = new ArrayList<Number>();
        List<Number> lN = new ArrayList<Number>();
        ArrayList<Number> aN = new ArrayList<Number>();
        cN = lN;
        cN = aN;
        
        
        List<String> ls = new ArrayList<String>();
        PayloadList<String, String> pls = null;
        ls = pls;
        
    }
    
    
    interface PayloadList<E, P> extends List<E>
    {
        void setPayload(int index, P val);
    }

    
}



/*
 * Changes:
 * $Log: $
 */