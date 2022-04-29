/*
 * HiddenMembers.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch8_class_design.polymorphism;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class HiddenMembers
{
    public static void main(String[] args)
    {
        CrestedPenguin1.main(null);
    }
}


class Penguin1
{
    public static int getHeight()
    {
        return 3;
    }


    public void printInfo()
    {
        System.out.println(this.getHeight()); // not overriden
    }
}


class CrestedPenguin1 extends Penguin1
{
    public static int getHeight()
    {
        return 8;
    }


    public static void main(String... fish)
    {
        new CrestedPenguin1().printInfo();
    }
}

/*
 * Changes:
 * $Log: $
 */