/*
 * PrivateContructorClass.java
 *
 * Copyright by CRIF AG
 * Z�rich
 * All rights reserved.
 */
package java21.com.basic.ch8_class_design.extend_private_contructor;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PrivateContructorClass
{
    private PrivateContructorClass()
    {
        System.out.println("Parent Contructor.");
    }
    
    public class PrivateContructorInnerClass extends PrivateContructorClass
    {
        public PrivateContructorInnerClass()
        {
            System.out.println("Children Contructor.");
        }
    }
    
    public static void main(String[] args)
    {
        PrivateContructorInnerClass innerClass = new PrivateContructorClass(). new PrivateContructorInnerClass();
        System.out.println("Instanciated");
    }
}



/*
 * Changes:
 * $Log: $
 */