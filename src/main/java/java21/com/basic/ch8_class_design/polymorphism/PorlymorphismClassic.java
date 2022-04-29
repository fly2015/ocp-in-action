/*
 * PorlymorphismClassic.java
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
public class PorlymorphismClassic
{
    public static void main(String[] args)
    {
        EmperorPenguin.main(null);
    }
}

class Penguin
{
    public int getHeight()
    {
        return 3;
    }


    public void printInfo()
    {
        System.out.print(this.getHeight());// this IS optional
    }
}


class EmperorPenguin extends Penguin
{
    public int getHeight()
    {
        return 8;
    }


    public static void main(String[] fish)
    {
        new EmperorPenguin().printInfo();
    }
}
/*
 * Changes:
 * $Log: $
 */