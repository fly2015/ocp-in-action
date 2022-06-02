/*
 * GenericsInheritanceAndSubtypes2.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.doc;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 * @param <P>
 */
public class GenericsInheritanceAndSubtypes2<P>
{
    interface PayloadList<E,P> extends List<E> {
        void setPayload(int index, P val);
      }
    
    public class PayloadListImpl<E, P> implements PayloadList<E, P>{

        /**
         * @see java.util.List#size()
         */
        @Override
        public int size()
        {
            // TODO Auto-generated method stub
            return 0;
        }

        /**
         * @see java.util.List#isEmpty()
         */
        @Override
        public boolean isEmpty()
        {
            // TODO Auto-generated method stub
            return false;
        }

        /**
         * @see java.util.List#contains(java.lang.Object)
         */
        @Override
        public boolean contains(Object o)
        {
            // TODO Auto-generated method stub
            return false;
        }

        /**
         * @see java.util.List#iterator()
         */
        @Override
        public Iterator<E> iterator()
        {
            // TODO Auto-generated method stub
            return null;
        }

        /**
         * @see java.util.List#toArray()
         */
        @Override
        public Object[] toArray()
        {
            // TODO Auto-generated method stub
            return null;
        }

        /**
         * @see java.util.List#toArray(java.lang.Object[])
         */
        @Override
        public <T> T[] toArray(T[] a)
        {
            // TODO Auto-generated method stub
            return null;
        }

        /**
         * @see java.util.List#add(java.lang.Object)
         */
        @Override
        public boolean add(E e)
        {
            // TODO Auto-generated method stub
            return false;
        }

        /**
         * @see java.util.List#remove(java.lang.Object)
         */
        @Override
        public boolean remove(Object o)
        {
            // TODO Auto-generated method stub
            return false;
        }

        /**
         * @see java.util.List#containsAll(java.util.Collection)
         */
        @Override
        public boolean containsAll(Collection< ? > c)
        {
            // TODO Auto-generated method stub
            return false;
        }

        /**
         * @see java.util.List#addAll(java.util.Collection)
         */
        @Override
        public boolean addAll(Collection< ? extends E> c)
        {
            // TODO Auto-generated method stub
            return false;
        }

        /**
         * @see java.util.List#addAll(int, java.util.Collection)
         */
        @Override
        public boolean addAll(int index, Collection< ? extends E> c)
        {
            // TODO Auto-generated method stub
            return false;
        }

        /**
         * @see java.util.List#removeAll(java.util.Collection)
         */
        @Override
        public boolean removeAll(Collection< ? > c)
        {
            // TODO Auto-generated method stub
            return false;
        }

        /**
         * @see java.util.List#retainAll(java.util.Collection)
         */
        @Override
        public boolean retainAll(Collection< ? > c)
        {
            // TODO Auto-generated method stub
            return false;
        }

        /**
         * @see java.util.List#clear()
         */
        @Override
        public void clear()
        {
            // TODO Auto-generated method stub
            
        }

        /**
         * @see java.util.List#get(int)
         */
        @Override
        public E get(int index)
        {
            // TODO Auto-generated method stub
            return null;
        }

        /**
         * @see java.util.List#set(int, java.lang.Object)
         */
        @Override
        public E set(int index, E element)
        {
            // TODO Auto-generated method stub
            return null;
        }

        /**
         * @see java.util.List#add(int, java.lang.Object)
         */
        @Override
        public void add(int index, E element)
        {
            // TODO Auto-generated method stub
            
        }

        /**
         * @see java.util.List#remove(int)
         */
        @Override
        public E remove(int index)
        {
            // TODO Auto-generated method stub
            return null;
        }

        /**
         * @see java.util.List#indexOf(java.lang.Object)
         */
        @Override
        public int indexOf(Object o)
        {
            // TODO Auto-generated method stub
            return 0;
        }

        /**
         * @see java.util.List#lastIndexOf(java.lang.Object)
         */
        @Override
        public int lastIndexOf(Object o)
        {
            // TODO Auto-generated method stub
            return 0;
        }

        /**
         * @see java.util.List#listIterator()
         */
        @Override
        public ListIterator<E> listIterator()
        {
            // TODO Auto-generated method stub
            return null;
        }

        /**
         * @see java.util.List#listIterator(int)
         */
        @Override
        public ListIterator<E> listIterator(int index)
        {
            // TODO Auto-generated method stub
            return null;
        }

        /**
         * @see java.util.List#subList(int, int)
         */
        @Override
        public List<E> subList(int fromIndex, int toIndex)
        {
            // TODO Auto-generated method stub
            return null;
        }

        /**
         * @see java21.com.advanced.ch14_generic_and_collection.generic.doc.GenericsInheritanceAndSubtypes2.PayloadList#setPayload(int, java.lang.Object)
         */
        @Override
        public void setPayload(int index, P val)
        {
            // TODO Auto-generated method stub
            
        }
        
    }
    public void main(String[] args)
    {
        PayloadList<String,String> payloadList = new PayloadListImpl<String,String>();
        payloadList.setPayload(0, null);
    }
}



/*
 * Changes:
 * $Log: $
 */