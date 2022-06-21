/*
 * ConstructSensitiveObjectDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch22_sercurity;

import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ConstructSensitiveObjectDemo
{

}


class FoodOrder
{
    private String item;
    private int count;

    public FoodOrder(String item, int count)
    {
        setItem(item);
        setCount(count);
    }


    public String getItem()
    {
        return item;
    }


    public void setItem(String item)
    {
        this.item = item;
    }


    public final int getCount()
    {
        return count;
    }


    public final void setCount(int count)
    {
        this.count = count;
    }
    

    public static int total(List<FoodOrder> orders)
    {
        return orders.stream().mapToInt(FoodOrder::getCount).sum();
    }
    

    public FoodOrder getOrder(String item, int count)
    {
        return new FoodOrder(item, count);
    }
}


class HarryFoodOrder extends FoodOrder
{
    public HarryFoodOrder(String item, int count)
    {
        super(item, count);
    }

    
    /*
     * public int getCount()
     * {
     * return 0;
     * }
     */

   // public void setCount(int count) { super.setCount(0); }
}
/*
 * Changes:
 * $Log: $
 */