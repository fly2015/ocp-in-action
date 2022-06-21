/*
 * MutableObjectDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch22_sercurity;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MutableObjectDemo
{

}


final class Animal
{
    private final ArrayList<String> favoriteFoods;

    public Animal()
    {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }


    public List<String> getFavoriteFoods()
    {
        return favoriteFoods;
    }
}

/*
 * Changes:
 * $Log: $
 */