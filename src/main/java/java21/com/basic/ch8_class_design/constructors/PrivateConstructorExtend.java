/*
 * PrivateConstructorExtend.java
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
public class PrivateConstructorExtend
{
    private PrivateConstructorExtend()
    {
        System.out.println("Parent Contructor.");
    }
    
    public class PrivateContructorInnerClass extends PrivateConstructorExtend
    {
        public PrivateContructorInnerClass()
        {
            System.out.println("Children Contructor.");
        }
    }
    
    public static void main(String[] args)
    {
        PrivateContructorInnerClass innerClass = new PrivateConstructorExtend(). new PrivateContructorInnerClass();
        System.out.println("Instanciated");
    }
}


/*
 * Changes:
 * $Log: $
 */