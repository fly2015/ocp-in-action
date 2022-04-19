/*
 * TestInherittance.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch8_class_design.inheritance;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InherittanceTester
{
    public static void main(String[] args)
    {
        // Upcasting : subtype are assigned to parent reference type.
        Product p1 = new Food();
        Product p2 = new Drink();
        Product p3 = new Product();
        Object p4 = new Product();
        Food p5 = new Food();
        
        Product p17 = p5; // OK
        Product p7 = (Product)p5; // OK
        
        // Downcasting :
        // parent is assigned to a specific subtype ref.
        // if the parent reference is referring to that subtype -> OK
        Food f1 = (Food) p1;//OK
        //. NOT -> runtime Error.
        
        //Food f2 = (Food)new Product(); // Runtime Error
        //Food f3 = (Food)p3;
    }
}



/*
 * Changes:
 * $Log: $
 */