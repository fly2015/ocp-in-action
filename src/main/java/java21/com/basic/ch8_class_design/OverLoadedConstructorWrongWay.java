/*
 * OverLoadedConstructorWrongWay.java
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
public class OverLoadedConstructorWrongWay
{
    public static void main(String[] args)
    {
        Hamster hamster = new Hamster(10);
        System.out.println(hamster.getColor());
        System.out.println(hamster.getWeight());
    }
}


class Hamster
{
    private String color;
    private int weight;

    public Hamster(int weight)
    {
        new Hamster(weight, "brown"); // Compiles, but incorrect
    }
    
        /*
         * public Hamster(int weight)
         * { // First constructor
         * this.weight = weight;
         * color = "brown";
         * }
         */
    
    
    public Hamster(int weight, String color)
    { // Second constructor
        this.weight = weight;
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public int getWeight()
    {
        return weight;
    }
}

/*
 * Changes:
 * $Log: $
 */