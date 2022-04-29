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
public class OverLoadedConstructorCorrectWay
{
    public static void main(String[] args)
    {
        Hamster1 hamster = new Hamster1(10);
        System.out.println(hamster.getColor());
        System.out.println(hamster.getWeight());
    }

}

class Hamster2
{
    public Hamster2(int a)
    {
        this();
    }


    public Hamster2()
    {
        // TODO Auto-generated constructor stub
    }
}
class Hamster1
{
    private String color;
    private int weight;

    public Hamster1(int weight)
    {
       this(weight, "brown");
    }
    
    
    public Hamster1(int weight, String color)
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