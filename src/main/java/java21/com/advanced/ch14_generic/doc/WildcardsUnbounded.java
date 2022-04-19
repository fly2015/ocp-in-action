package java21.com.advanced.ch14_generic.doc;

import java.util.Arrays;
import java.util.List;

public class WildcardsUnbounded {
	//There are two scenarios where an unbounded wildcard is a useful approach:
	// if you are writing a method that can be implemented using functionality provided in the Object class.
	// When the code is using methods in the generic class that don't depend on the type parameter. 
	// For example, List.size or List.clear. In fact, Class<?> is so often used because most of the methods in Class<T> do not depend on T.
	
	public static void printList(List<Object> list) { // print only list object
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}
	
	
	public static void printListAny(List<?> list) { // print list of any
	    for (Object elem: list)
	        System.out.print(elem + " ");
	    System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		//Because for any concrete type A, List<A> is a subtype of List<?>, you can use printList to print a list of any type:
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String>  ls = Arrays.asList("one", "two", "three");
		printListAny(li);
		printListAny(ls);
	}
}
