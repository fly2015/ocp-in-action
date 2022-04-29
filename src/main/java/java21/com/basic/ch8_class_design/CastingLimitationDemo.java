/*
 * CastingLimitationDemo.java
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
public class CastingLimitationDemo
{
    /*
     * This code creates an instance of Rodent and then tries to cast it
        to a subclass of Rodent, Capybara. Although this code will
        compile, it will throw a ClassCastException at runtime since
        the object being referenced is not an instance of the Capybara
        class. The thing to keep in mind in this example is the Rodent
        object created does not inherit the Capybara class in any way
     */
}


class Rodent
{
}


class Capybara extends Rodent
{
    public static void main(String[] args)
    {
        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara)rodent; // ClassCastException
    }
}

/*
 * Changes:
 * $Log: $
 */