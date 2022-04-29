/*
 * OrderInitializationOfInstanceDemo.java
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
public class OrderInitializationOfInstanceDemo2
{
    
    //  0-10-BestZoo-z-
    public static void main(String[] args)
    {
        Chimpanzee.main(null);
    }
}


class Primate
{
    public Primate()
    {
        System.out.print("Primate-");
    }
}


class Ape extends Primate
{
    public Ape(int fur)
    {
        System.out.print("Ape1-");
    }


    public Ape()
    {
        System.out.print("Ape2-");
    }
}


class Chimpanzee extends Ape
{
    public Chimpanzee()
    {
        super(2);
        System.out.print("Chimpanzee-");
    }


    public static void main(String[] args)
    {
        new Chimpanzee();
    }
}

/*
 * Changes:
 * $Log: $
 */