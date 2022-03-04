/*
 * CrateAnimal.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_14_generic.book;

import java21.com.advanced.ch_14_generic.sdo.Animal;


/**
 * @author nhqhien
 * @version $Revision: $
 */
public class CrateAnimal<T extends Animal>
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