/*
 * OverridenHiddenFields.java
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
public class OverridenHiddenFields
{
    public static void main(String[] args)
    {
        ParentName parentName = new ChildName();
        System.out.println(parentName.name);
        parentName.printName();
        
        ChildName childName = new ChildName();
        System.out.println(childName.name);
        childName.printName();
    }
}

class ParentName
{
    protected String name = "Parent";
    
    public void printName()
    {
        System.out.println(name);
    }
}

class ChildName extends ParentName
{
    public String name = "Child";
    
    public void printName()
    {
        System.out.println(name);
    }
}



/*
 * Changes:
 * $Log: $
 */