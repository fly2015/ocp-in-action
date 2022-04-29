/*
 * ConstructorWithFinal.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch8_class_design.constructors;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */

public class ConstructorWithFinal
{
    public static void main(String[] args)
    {
        MouseHouse ms = new MouseHouse();
    }

}


class MouseHouse
{
    private final int volume;
    private final String type;

    {
        this.volume = 10;
    }

    public MouseHouse(String type)
    {
        this.type = type;
    }


    public MouseHouse()
    {
        this(null); // call anothers contructor in the same class with final variables.
    }

    /*
     * public ConstructorWithFinal()
     * { // DOES NOT COMPILE
     * this.volume = 2; // DOES NOT COMPILE
     * }
     */

}



/*
 * Changes:
 * $Log: $
 */