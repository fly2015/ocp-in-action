package java21.com.advanced.ch14_generic_and_collection.generic.doc;

import java.util.ArrayList;
import java.util.List;

import java21.com.advanced.ch14_generic_and_collection.generic.sdo.Animal;
import java21.com.advanced.ch14_generic_and_collection.generic.sdo.Cat;
import java21.com.advanced.ch14_generic_and_collection.generic.sdo.Dog;
import java21.com.advanced.ch14_generic_and_collection.generic.sdo.Original;

public class B3WildcardsLowerBounded {
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
		addNumbers(lIntegerSupper1);
		
		List<? super Original> list = new ArrayList<Object>();
		List<? super Original> list1 = new ArrayList<Original>();
        list.add(new Dog());
        list.add(new Animal());
        list.add(new Cat());
        list.add(new Original());
        
        list.forEach((item) -> System.out.println(item.getClass().getSimpleName()));
	}
}
