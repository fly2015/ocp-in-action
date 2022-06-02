/*
 * TypeUseDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch13_anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TypeUseDemo
{

}

@Target(ElementType.TYPE_USE)
@interface Technical {}


// NetworkRepair.java
class NetworkRepair
{
    class OutSrc extends @Technical NetworkRepair
    {
    }

    public void repair()
    {
        var repairSubclass = new @Technical NetworkRepair(){};
        var o = new @Technical NetworkRepair().new @Technical OutSrc();
        int remaining = (@Technical int)10.0;
    }
}


/*
 * Changes:
 * $Log: $
 */