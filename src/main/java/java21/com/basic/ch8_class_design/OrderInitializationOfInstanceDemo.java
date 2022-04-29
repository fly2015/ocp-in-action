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
public class OrderInitializationOfInstanceDemo
{
    
    //  0-10-BestZoo-z-
    public static void main(String[] args)
    {
        ZooTickets.main(null);
    }
}

class ZooTickets
{
    private String name = "BestZoo";
    
    {
        System.out.print(name + "-");
    }
    
    private static int COUNT = 0;
    
    static
    {
        System.out.print(COUNT + "-");
    }
    
    static
    {
        COUNT += 10;
        System.out.print(COUNT + "-");
    }

    public ZooTickets()
    {
        System.out.print("z-");
    }


    public static void main(String... patrons)
    {
        new ZooTickets();
    }
}

/*
 * Changes:
 * $Log: $
 */