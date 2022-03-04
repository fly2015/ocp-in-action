/*
 * Outer.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch_9_advanced_class_design.nesteds.staticnested;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Outer
{
    private static String descOuter = "Outer";
    private String a ="aaa";
    public static void createInner(String desc)
    {
        //String a = Inner.desc;
        //new Inner(desc);
        //Inner.test();
    }
    protected static class Inner
    {
        public Inner()
        {
        }
        public Inner(String desc)
        {
            createInner(desc);
        }
        
        public void test()
        {
           // System.out.println(a);
        }
        
        public void testContext()
        {
           // System.out.println(a);
        }
    }
    
    public static void main(String[] args)
    {
        Inner in = new Inner();
    }
}



/*
 * Changes:
 * $Log: $
 */