/*
 * LocalNested.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch9_advanced_class_design.nesteds.locals;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class LocalNested
{
    public int x = 1;
    public void plusX()
    {
        x = x+1;
    }
    public void test(int in) {
        class Inner{
            private void print(int a) {
                System.out.println(a);
            }
        }
        
        Inner in1 = new Inner();
        in1.print(in);
    }
    
    public static void main(String[] args)
    {
        LocalNested localNested = new LocalNested();
        localNested.plusX();
        localNested.test(localNested.x);
    }
    
    class abc extends LocalNested{
        
    }
}



/*
 * Changes:
 * $Log: $
 */