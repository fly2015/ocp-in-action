/*
 * PassingAnonymousInstanceAsMethodParam.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.nesteds.anonymous;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PassingAnonymousInstanceAsMethodParam
{
    public static void main(String[] args)
    {
        System.out.println(new ZooGiftShop().pay());
    }
}


class ZooGiftShop
{
    abstract class SaleTodayOnly
    {
        private int x;
        private SaleTodayOnly(int x)
        {
            this.x = x;
        }
         int dollarsOff()
         {
            return x;
         }
    }

    public int pay()
    {
        return admission(50, new SaleTodayOnly(10)
        {
            public int dollarsOff()
            {
                return 3 + super.x ;
            }
        });
    }


    public int admission(int basePrice, SaleTodayOnly sale)
    {
        return basePrice - sale.dollarsOff();
    }

}

/*
 * Changes:
 * $Log: $
 */