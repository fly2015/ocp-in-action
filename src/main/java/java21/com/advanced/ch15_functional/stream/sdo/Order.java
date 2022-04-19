/*
 * Order.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.stream.sdo;

import java.util.Map;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Order
{
    private long orderId;
    private long userId;
    private Map<Product, Integer> products;

    public long getOrderId()
    {
        return orderId;
    }


    public void setOrderId(long orderId)
    {
        this.orderId = orderId;
    }


    public long getUserId()
    {
        return userId;
    }


    public void setUserId(long userId)
    {
        this.userId = userId;
    }


    public Map<Product, Integer> getProducts()
    {
        return products;
    }


    public void setProducts(Product product, int quantity)
    {
        this.products.put(product, quantity);
    }
}

/*
 * Changes:
 * $Log: $
 */