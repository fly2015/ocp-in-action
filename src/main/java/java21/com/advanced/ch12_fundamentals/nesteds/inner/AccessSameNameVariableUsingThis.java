/*
 * AccessSameNameVariableUsingThis.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.nesteds.inner;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AccessSameNameVariableUsingThis
{

}


class A
{
    private int x = 10;

    private class B
    {
        private int x = 20;

        class C
        {
            private int x = 30;

            public void allTheX()
            {
                System.out.println(x); // 30
                System.out.println(this.x); // 30
                System.out.println(B.this.x); // 20
                System.out.println(A.this.x); // 10
            }
        }
    }

    public static void main(String[] args)
    {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.allTheX();
    }
}

/*
 * Changes:
 * $Log: $
 */