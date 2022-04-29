/*
 * UsingThisDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch8_class_design;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class UsingThisDemo
{
    public static void main(String[] args)
    {
        Duck b = new Duck();
        b.setData(1,2);
        System.out.print(b.length + " " + b.height + " " + b.color);
    }
}


class Duck
{
    protected String color;
    protected int height;
    protected int length;

    public void setData(int length, int theHeight)
    {
        length = this.length; // Backwards – no good!
        height = theHeight; // Fine because adifferent name
        this.color = "white"; // Fine, but this. not necessary
    }
}


/*
 * Changes:
 * $Log: $
 */