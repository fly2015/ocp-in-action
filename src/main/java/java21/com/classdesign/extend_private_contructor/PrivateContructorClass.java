/*
 * PrivateContructorClass.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.classdesign.extend_private_contructor;

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