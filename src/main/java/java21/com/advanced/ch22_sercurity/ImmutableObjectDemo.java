/*
 * ImmutableObjectDemo.java
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
public class ImmutableObjectDemo
{
    public static void main(String[] args)
    {
        ImmutableObjectDemo.main(null);
    }
}

final class Animal1 implements Cloneable
{
    private final ArrayList<String> favoriteFoods;

    public Animal1(ArrayList<String> favoriteFoods)
    {
        if (favoriteFoods == null)
            throw new RuntimeException("favoriteFoods is required");
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }
    
    public int getFavoriteFoodsCount()
    {
        return favoriteFoods.size();
    }

    public String getFavoriteFoods(int idx)
    {
        return favoriteFoods.get(idx);
    }
    

    public ArrayList<String> getFavoriteFoods()
    {
        return new ArrayList<String>(this.favoriteFoods);
    }
    

    public void modifyNotSoImmutableObject()
    {
        var favorites = new ArrayList<String>();
        favorites.add("Apples");
        var animal = new Animal1(favorites);
        System.out.print(animal.getFavoriteFoodsCount());
        favorites.clear();
        System.out.print(animal.getFavoriteFoodsCount());
    }
    
    
    public static void main(String[] args)
    {
        new Animal1(new ArrayList<>()).modifyNotSoImmutableObject();
    }
    

    public Animal1  clone()
    {
        ArrayList<String> listClone = (ArrayList)favoriteFoods.clone();
        return new Animal1(listClone);
    }
}

/*
 * Changes:
 * $Log: $
 */