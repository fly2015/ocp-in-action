/*
 * SDO.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package hng;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SDO implements Serializable, Cloneable
{
    private final String name;

    public SDO(String name)
    {
        super();
        this.name = name;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SDO other = (SDO)obj;
        return Objects.equals(name, other.name);
    }

    @Override
    public String toString()
    {
        return "SDO [name=" + name + "]";
    }

    public String getName()
    {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        // TODO Auto-generated method stub
        return super.clone();
    } 
    
    
}



/*
 * Changes:
 * $Log: $
 */