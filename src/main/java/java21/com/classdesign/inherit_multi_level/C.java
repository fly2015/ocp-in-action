/*
 * C.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.classdesign.inherit_multi_level;

import java.io.IOException;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class C extends B
{
    public static int sa = 30;
    public C() {
        this(1);
        System.out.println(super.sa);
    }
    
    public C(int i) {
        super(i);
    }
    

    
    public static Number printI(int i) throws IOException
    {
        return i;
    }
    
    public static void main(String[] args) throws IOException
    {
        //A aa = new A(10);
       // C cc = new C();//OK
        B bb = new C();
        System.out.println(bb.printI(10));
        
        //List<CharSequence> a = null;
        //a.add(new StringBuilder());
        //a = b;

    }
}



/*
 * Changes:
 * $Log: $
 */