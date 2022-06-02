package java21.com.advanced.ch14_generic_and_collection.generic.doc;

import java.util.List;

public class WildcardsUpperBounded {
	class Foo{
		
	}
	
	
	public static void process(List<? extends Foo> list) {
	    for (Foo elem : list) {
	        // ...
	    }
	}
	
	public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    return s;
	}
}
