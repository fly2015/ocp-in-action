/*
 * SDOHolderTest.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package hng;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SDOHolderTest
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        final Map<Integer, SDO> originalMap = new HashMap<Integer, SDO>();
        originalMap.put(1, new SDO("A"));
        final LinkedList<SDO> originalLinkedList = new LinkedList<>();
        originalLinkedList.push(new SDO("C"));
        SDOHolder orginalHolder = new SDOHolder(originalMap, originalLinkedList);
        
        /*
         * final Map<Integer, SDO> originalMap1 = new HashMap<Integer, SDO>();
         * originalMap1.put(1, new SDO("A"));
         * final LinkedList<SDO> originalLinkedList1 = new LinkedList<>();
         * originalLinkedList1.push(new SDO("C"));
         * SDOHolder orginalHolder1 = new SDOHolder(originalMap1, originalLinkedList1);
         */
        
        SDOHolder sdoHolderClone = (SDOHolder)orginalHolder.clone();
        
        System.out.println(orginalHolder.getOriginalMap().get(1).toString() + " and " + sdoHolderClone.getOriginalMap().get(1).toString() + " equal: " + (orginalHolder.getOriginalMap().get(1) == sdoHolderClone.getOriginalMap().get(1)));
        System.out.println(orginalHolder.getOriginalLinkedList().getFirst().toString() + " and " + sdoHolderClone.getOriginalLinkedList().getFirst().toString() 
                           + " equal: " + (orginalHolder.getOriginalLinkedList().getFirst() == sdoHolderClone.getOriginalLinkedList().getFirst()));
       
        SDOHolder deepCopyHolder = orginalHolder.deepCopy();
        System.out.println(orginalHolder.getOriginalMap().get(1).toString() + " and " + deepCopyHolder.getOriginalMap().get(1).toString() + " equal: " + (orginalHolder.getOriginalMap().get(1) == deepCopyHolder.getOriginalMap().get(1)));
    
        System.out.println(orginalHolder.getOriginalLinkedList().getFirst().toString() + " and " + deepCopyHolder.getOriginalLinkedList().getFirst().toString() 
         + " equal: " + (orginalHolder.getOriginalLinkedList().getFirst() == deepCopyHolder.getOriginalLinkedList().getFirst()));

    }
}



/*
 * Changes:
 * $Log: $
 */