package java21.com.advanced.ch14_generic_and_collection.generic.doc;

import java.util.List;

//an upper bounded wildcard to relax the restrictions on a variable
public class B1WildcardsUpperBounded {
	class Foo{
		
	}
	
	
	public static void process(List<? extends Foo> list) {
	    for (Foo elem : list) {
	        // ...
	    }
	    list.add(null);
	}
	
	public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    return s;
	}
}
