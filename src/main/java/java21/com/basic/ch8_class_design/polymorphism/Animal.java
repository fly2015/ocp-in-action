/*
 * Animal.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch_8_class_design.polymorphism;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Animal
{
    void eat()
    {
        System.out.println("Animal eat");
    }
}


interface HasTail
{
    public int getTailLength();
}


interface HasWhiskers
{
    public int getNumberOfWhiskers();
}


abstract class HarborSeal implements HasTail, HasWhiskers
{
    public int getTailLength()
    {
        return 0;
    }
    
    public int getNumberOfWhiskers()
    {
        return 1;
    }
}


class CommonSeal extends HarborSeal
{
    
}


interface Dances
{
    String swingArms();
}


interface EatsFish
{
    CharSequence swingArms();
}


class Penguin implements Dances, EatsFish
{
    public String swingArms()
    {
        return "swing!";
    }
}

/*
 * Changes:
 * $Log: $
 */