/*
 * CrateTest.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic.book;

import java.util.ArrayList;
import java.util.List;

import java21.com.advanced.ch14_generic.sdo.Animal;
import java21.com.advanced.ch14_generic.sdo.Dog;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CrateTest
{
    public static void main(String[] args)
    {
        // Crate of String
        Crate<String> crate = new Crate<>();
        crate.packPackage("love");
        String string = crate.emptyPackage();
        System.out.println("Got package: " + string);
        
        // Crate of Integer
        Crate<Integer> crate1 = new Crate<>();
        crate1.packPackage(10_00);
        Integer integer = crate1.emptyPackage();
        System.out.println("Got package: " + integer);
        
        // Crate of Dog
        Crate<Dog> dogCreate = new Crate<Dog>();
        Dog dog = new Dog();
        dogCreate.packPackage(dog);
        Dog dogPackage = dogCreate.emptyPackage();
        System.out.println("Got package: " + dogPackage.getClass().getSimpleName());
        
        // Crate of Animal contain Dog
        Crate<Animal> animalCreate1 = new Crate<Animal>();
        Dog dog1 = new Dog();
        animalCreate1.packPackage(dog1);
        Animal animalPackage = animalCreate1.emptyPackage();
        System.out.println("Got package " + animalPackage.getClass().getSuperclass().getSimpleName() + ": " + animalPackage.getClass().getSimpleName());
        
        // 
        Crate<List<String>> crateOfList = new Crate<List<String>>();
        crateOfList.packPackage(new ArrayList<String>());
        List<String> emptyPackage = crateOfList.emptyPackage();
    }
}



/*
 * Changes:
 * $Log: $
 */