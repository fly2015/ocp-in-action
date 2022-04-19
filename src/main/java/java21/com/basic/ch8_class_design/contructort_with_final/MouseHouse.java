/*
 * MouseHouse.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch_8_class_design.contructort_with_final;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MouseHouse
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
     * public MouseHouse()
     * { // DOES NOT COMPILE
     * this.volume = 2; // DOES NOT COMPILE
     * }
     */
    
    public static void main(String[] args)
    {
        MouseHouse ms = new MouseHouse();
    }
}



/*
 * Changes:
 * $Log: $
 */