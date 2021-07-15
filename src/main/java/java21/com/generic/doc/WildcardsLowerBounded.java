package java21.com.generic.doc;

import java.util.ArrayList;
import java.util.List;

public class WildcardsLowerBounded {
	//a lower bounded wildcard restricts the unknown type to be a specific type or a super type of that type.
	
	public static void addNumbers(List<? super Integer> list) {
	    for (int i = 1; i <= 10; i++) {
	        list.add(i);
	    }
	}
	
	public static void main(String[] args) {
		List<Integer> lIntegerSupper = new ArrayList<Integer>();
		List<Object> lIntegerSupper1 = new ArrayList<Object>();
		addNumbers(lIntegerSupper);
	}
}
