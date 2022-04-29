/*
 * InheritanceUsingPrivateMembers.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch8_class_design.inheritance;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InheritanceUsingPrivateMembers extends ParentClassDemo
{
    public static void main(String[] args)
    {
        InheritanceUsingPrivateMembers inheritance = new InheritanceUsingPrivateMembers();
        inheritance.setName("Cool");
        inheritance.printName();
    }
}

class ParentClassDemo
{
    private String name = "Hien";
    
    public void printName()
    {
        System.out.println(name);
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}


/*
 * Changes:
 * $Log: $
 */