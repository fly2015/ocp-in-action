/*
 * InnerClassDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.nesteds.inner;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InnerClassDemo
{
    private int x = 0;
    static final String s = new String("");
    static final List<String> sl = new ArrayList<String>();
    private class InnerClassDemo1
    {
        //static final String s = new String("");
        private int y = 10;
        final static int z = 15;
        public int getX()
        {
            return x;
        }
       
    }
    
    static void doLoad() {
        System.out.println(InnerClassDemo1.z);
    }
    
    public static void main(String[] args)
    {
        int z = InnerClassDemo1.z;
        InnerClassDemo1 innerClassDemo = new InnerClassDemo(). new InnerClassDemo1(); //access inner class need to via outer instance
        InnerClassDemo.doLoad();
    }
}



/*
 * Changes:
 * $Log: $
 */