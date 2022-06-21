/*
 * SercurityDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch22_sercurity;

import java.util.Map;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SercurityDemo
{

}


class ComboLocks
{
    private Map<String, String> combos; // LIMIT ACCESSIBILITY

    public boolean isComboValid(String animal, String combo)
    {
        var correctCombo = combos.get(animal);
        return combo.equals(correctCombo);
    }
}


final class GrasshopperCage // RESTRICTING EXTENSIBILITY
{
    public static void openLock(ComboLocks comboLocks, String combo)
    {
        if (comboLocks.isComboValid("grasshopper", combo))
            System.out.println("Open!");
    }
}

/*
 * Changes:
 * $Log: $
 */