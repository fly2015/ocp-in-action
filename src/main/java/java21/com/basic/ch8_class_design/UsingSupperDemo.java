/*
 * UsingSupperDemo.java
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
public class UsingSupperDemo
{
    public static void main(String[] args)
    {
        System.out.print(new Bat().getType());
    }
}


class Mammal
{
    String type = "mammal";
}


class Bat extends Mammal
{
    String type = "bat";

    public String getType()
    {
        return super.type + ":" + this.type;
    }
}

/*
 * Changes:
 * $Log: $
 */