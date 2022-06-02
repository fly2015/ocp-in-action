/*
 * Crate.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.book;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Crate<T>
{
    private T contents;
    
    public void packPackage(T contents)
    {
        this.contents = contents;
    }
    
    public T emptyPackage()
    {
        return contents;
    }
}



/*
 * Changes:
 * $Log: $
 */