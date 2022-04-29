/*
 * ConstructorWithNoDefaultConstructorInParent.java
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
public class ConstructorWithNoDefaultConstructorInParent
{
    public static void main(String[] args)
    {
        
    }
}

class Parent
{
    private String name;
    public Parent(String name)
    {
        this.name = name;
    }
}

class Children extends Parent
{
    public Children()
    {
        super("Hien");
    }
    
    public Children(String name)
    {
        this();
    }
}


/*
 * Changes:
 * $Log: $
 */