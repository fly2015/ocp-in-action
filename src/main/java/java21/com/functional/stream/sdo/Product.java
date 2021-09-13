/*
 * Product.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.functional.stream.sdo;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Product
{
    private long id;
    private String name;
    private int stock;
    private String type;
    private double price;
    
    
    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public String getType()
    {
        return type;
    }


    public void setType(String type)
    {
        this.type = type;
    }


    public double getPrice()
    {
        return price;
    }


    public void setPrice(double price)
    {
        this.price = price;
    }


    public int getStock()
    {
        return stock;
    }


    public void setStock(int stock)
    {
        this.stock = stock;
    }


    @Override
    public int hashCode()
    {
        return String.valueOf(this.id).hashCode();
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (obj.getClass() != this.getClass()) {
            return false;
        } else if (!super.equals(obj)) {
            return false;
        } else {
            Product product = (Product) obj;
            if (product.getId() == this.id)
            {
                return true;
            }
            return false;
        }
    }
}



/*
 * Changes:
 * $Log: $
 */