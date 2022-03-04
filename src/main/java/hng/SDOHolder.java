/*
 * SDOHolder.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package hng;

import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SDOHolder implements Cloneable
{
    private  Map<Integer, SDO> originalMap;
    private final LinkedList<SDO> originalLinkedList;
    
    
    public Map<Integer, SDO> getOriginalMap()
    {
        return originalMap;
    }

    public LinkedList<SDO> getOriginalLinkedList()
    {
        return originalLinkedList;
    }

    public SDOHolder(Map<Integer, SDO> originalMap, LinkedList<SDO> originalLinkedList)
    {
        this.originalMap = originalMap;
        this.originalLinkedList = originalLinkedList;
    }
    
    public SDOHolder deepCopy()
    {
        @SuppressWarnings("unchecked")
        Map<Integer, SDO> copyMap = (Map<Integer, SDO>)SerialCloneHelper.clone(originalMap);
        @SuppressWarnings("unchecked")
        LinkedList<SDO> copyList = (LinkedList<SDO>)SerialCloneHelper.clone(originalLinkedList);
        /*
         * Map<Integer, SDO> copyMap = new HashMap<Integer, SDO>();
         * for (Entry<Integer, SDO> entry : originalMap.entrySet())
         * {
         * copyMap.put(Integer.valueOf(entry.getKey()), new SDO(entry.getValue().getName()));
         * }
         * LinkedList<SDO> copyList = new LinkedList<>();
         * Iterator<SDO> iterator = originalLinkedList.iterator();
         * while(iterator.hasNext())
         * {
         * copyList.add(iterator.next());
         * }
         */
        /*
         * for (SDO sdo : originalLinkedList)
         * {
         * copyList.add(sdo);
         * }
         */
        
        SDOHolder holder  = new SDOHolder(copyMap, copyList);
       
        return holder;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(originalLinkedList, originalMap);
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
        SDOHolder other = (SDOHolder)obj;
        return Objects.equals(originalLinkedList, other.originalLinkedList) && Objects.equals(originalMap, other.originalMap);
    }

    @Override
    public String toString()
    {
        return "SDOHolder [originalMap=" + originalMap + ", originalLinkedList=" + originalLinkedList + "]";
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