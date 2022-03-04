/*
 * QuestionsAndExercises.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.advanced.ch_14_generic.doc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class QuestionsAndExercises
{
	static int countOldNumber(Collection<? extends Integer> numbers) {
		int count = 0;
		Iterator<? extends Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			if(next != null && next.intValue() % 2 != 0)
			{
				count = count + 1;
			}
		}
		
		return count;
	}
	
	public static <T> T max(T x, T y) {
		Comparator<T> comparator = new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		int compare = comparator.compare(x, y);
        return compare > 0 ? x : y;
    }
	
	public static <T> T[] exchangePosition(T[] t, int fPos, int sPos)
	{
		T temp = t[fPos];
		t[fPos] = t[sPos];
		t[sPos] = temp;
		
		return t;
	}
	
	public static void main(String[] args) {
		
		// 1 Write a generic method to count the number of elements in a collection 
		// that have a specific property (for example, odd integers, prime numbers, palindromes
		Collection<Integer> cNumbers = new ArrayList<Integer>();
		cNumbers.add(1);
		cNumbers.add(2);
		cNumbers.add(3);
		cNumbers.add(4);
		cNumbers.add(5);
		
		System.out.println(countOldNumber(cNumbers));
		
		//2 -> No since unkown object type Y does snot support > operator
		max(4, 5);
		
		//3. Write a generic method to exchange the positions of two different elements in an array.
		Object [] objects = new Object[3];
		objects[0] = new String("ABC");
		objects[1] = new String("XYZ");
		objects[2] = new String("TEST");
		System.out.println("Position before exchange: ");
		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]);
		}
		System.out.println("Position after exchange 0 vs 1 ");
		Object[] exchangePosition = exchangePosition(objects, 0, 1);
		for (int i = 0; i < exchangePosition.length; i++) {
			System.out.println(exchangePosition[i]);
		}
		
		// 4. If the compiler erases all type parameters at compile time, why should you use generics?
		// help type save at compiler time, avoid error at runtime.
		
		// 8. Write a generic method to find the maximal element in the range [begin, end) of a list.
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("9");
		list.add("3");
		list.add("4");
		String findMaxElem = findMaxElem(list, 1, 4);
		System.out.println(findMaxElem);
		
		// 9. no -> since T is erase at runtime. Static could not access instance context.
		
		// 12
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(2);
		integers.add(3);
		integers.add(6);
		Predicate<Integer> predicate = null;
        findFirst(integers, 0, 3, predicate);
	}
	

    public static <T> int findFirst(List<T> list, int begin, int end, Predicate<T> p)
    {
        return end;
    }
	
	public static <T extends Comparable<T>> T findMaxElem(List<T> list, int begin, int end)
	{
		List<T> subList = list.subList(begin, end);
		T max = list.get(0);
		for (T t : subList) {
			int compareTo = t.compareTo(max);
			if (compareTo > 0) {
				max = t;
			}
		}
		return max;
	}
	
	
	// 5. What is the following class converted to after type erasure?
	//  Pair<Object, Object>
	public class Pair<K, V> {

	    public Pair(K key, V value) {
	        this.key = key;
	        this.value = value;
	    }

	    public K getKey() { return key; }
	    public V getValue() { return value; }

	    public void setKey(K key)     { this.key = key; }
	    public void setValue(V value) { this.value = value; }

	    private K key;
	    private V value;
	}
	
	// 6. What is the following method converted to after type erasure?
	// Comparable<Object>
	public static <T extends Comparable<T>>
    int findFirstGreaterThan(T[] at, T elem) {
		return 0;
	}	
	
	public static void print(List<? extends Number> list) {
	    for (Number n : list)
	        System.out.print(n + " ");
	    System.out.println();
	}
	
	

}



/*
 * Changes:
 * $Log: $
 */