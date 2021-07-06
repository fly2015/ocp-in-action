/*
 * Crate.java
 *
 * Copyright by CRIF AG
 * Z�rich
 * All rights reserved.
 */
package java21.com.generic.classes;

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