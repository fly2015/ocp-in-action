/*
 * MoreFunWithWildcards.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.generic.extra;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MoreFunWithWildcards
{
    interface Sink<T> {
        void flush(T t);
    }
    
    public static <T> T writeAll(Collection<? extends T> coll, Sink<T> snk) {
        T last = null;
        for (T t : coll) {
            last = t;
            snk.flush(last);
        }
        return last;
    }
    
    public static <T> T writeAll2(Collection<T> coll, Sink<? super T> snk) {
        T last = null;
        for (T t : coll) {
            last = t;
            snk.flush(last);
        }
        return last;
    }


    public static <T extends Comparable<? super T>> T max(Collection<T> coll)
    {
        return null;
    }
    
    class Foo implements Comparable<Object> {

        /**
         * @see java.lang.Comparable#compareTo(java.lang.Object)
         */
        @Override
        public int compareTo(Object o)
        {
            // TODO Auto-generated method stub
            return 0;
        }
    }
    
   public static <T> Set<T> unmodifiableSet(Set<T> set) {
       return set;
    }
    
    public static void main(String[] args)
    {
        Set<?> unknownSet = new HashSet<String>();
        unmodifiableSet(unknownSet);
        
        Collection<Foo> cf = null;
        max(cf); // Should work. by using  Comparable<? super T>
        
        Collection<String> cs = null;
        Sink<Object> s = null;
        
        Object writeAll = writeAll(cs, s); // T is upper bound, is a Object.
        
        String writeAll2 = writeAll2(cs, s); // T is a lower bound, is a String
        
        
        
        Comparator< ? super String> comparator = new Comparator<String>()
        {

            @Override
            public int compare(String o1, String o2)
            {
                // TODO Auto-generated method stub
                return 0;
            }
        };
        
        TreeSet<String> treeSet = new TreeSet<String>(comparator);
        Comparator< ? super String> comparator2 = new Comparator<Object>()
        {

            @Override
            public int compare(Object o1, Object o2)
            {
                
                // TODO Auto-generated method stub
                return 0;
            }
        };

        TreeSet<String> treeSet2 = new TreeSet<String>(comparator2);
    }
    
    
    
}



/*
 * Changes:
 * $Log: $
 */