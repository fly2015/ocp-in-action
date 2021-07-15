package java21.com.generic.doc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeInference {
	/*
	 * Type inference is a Java compiler's ability to look at each method invocation and corresponding declaration 
	 * to determine the type argument (or arguments) that make the invocation applicable
	 */

	static <T> T pick(T a1, T a2) { return a2; }
	Serializable s = pick("d", new ArrayList<String>());
	
	//Type Inference and Instantiation of Generic Classes
	Map<String, List<String>> myMap = new HashMap<String, List<String>>();
	Map<String, List<String>> myMapInfer = new HashMap<>();
	Map<String, List<String>> myMapUnchecked = new HashMap(); // unchecked conversion warning
	
	
	//Type Inference and Generic Constructors of Generic and Non-Generic Classes
	class MyClass<X> {
		<T> MyClass(T t) {
			// ...
		}
	}
	
	MyClass<Integer> a = new MyClass<Integer>("");
	MyClass<Integer> myObject = new MyClass<>(""); // Java 7 and later
	
	//Target Types
	List<String> listOne = Collections.emptyList(); 
	/*
	 * This statement is expecting an instance of List<String>; this data type is the target type.
		Because the method emptyList returns a value of type List<T>, the compiler infers that the type argument T must be the value String. 
	 * This works in both Java SE 7 and 8. Alternatively, you could use a type witness and specify the value of T as follows:
	 */
	List<String> listOneWitness = Collections.<String>emptyList(); // unnecessary
	
	void processStringList(List<String> stringList) {
	    // process stringList
	}
	
	void proccess() {
		processStringList(Collections.emptyList()); // java 7 does not complie
		processStringList(Collections.<String>emptyList()); //This is no longer necessary in Java SE 8. The notion of what is a target type has been expanded to include method arguments
	}
	
}
