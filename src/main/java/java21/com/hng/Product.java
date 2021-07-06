/*
 * Product.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.hng;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Product
{
    int id;
    String name;
    
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        // TODO Auto-generated method stub
        return this == obj || this.id == ((Product) obj).id;
    }

    @Override
    public int hashCode()
    {
        // TODO Auto-generated method stub
        return id;
    }
    
    
    
    
}



/*
 * Changes:
 * $Log: $
 */