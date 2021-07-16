/*
 * QuestionsAndExercises.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.generic.doc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

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
	
	public static void main(String[] args) {
		
		// 1 
		Collection<Integer> cNumbers = new ArrayList<Integer>();
		cNumbers.add(1);
		cNumbers.add(2);
		cNumbers.add(3);
		cNumbers.add(4);
		cNumbers.add(5);
		
		System.out.println(countOldNumber(cNumbers));
		
		//2 -> No since unkown object type Y does snot support > operator
		max(4, 5);
		
		//3 
		
	}
}



/*
 * Changes:
 * $Log: $
 */