/*
 * FinalAndPrivateMethod.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch9_advanced_class_design;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FinalAndPrivateMethod
{
    private void test()
    {
        System.out.println("Outer Private");
    }
    
    void test1()
    {
        System.out.println("Outer");
    }
    
    class FinalAndPrivateMethodInner extends FinalAndPrivateMethod
    {
        void testInner()
        {
            test();
            super.test1();
        }

        @Override
        void test1()
        {
            System.out.println("Inner");
        } 
    }
    
    public static void main(String[] args)
    {
        new FinalAndPrivateMethod().test();
        new FinalAndPrivateMethod().test1();
        new FinalAndPrivateMethod().new FinalAndPrivateMethodInner().testInner();
        new FinalAndPrivateMethod().new FinalAndPrivateMethodInner().test1();
    }
}



/*
 * Changes:
 * $Log: $
 */