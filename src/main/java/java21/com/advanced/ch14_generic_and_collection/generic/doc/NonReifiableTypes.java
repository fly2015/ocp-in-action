package java21.com.advanced.ch14_generic_and_collection.generic.doc;

import java.util.ArrayList;
import java.util.List;

public class NonReifiableTypes {
	List<?> lAny = new ArrayList<>();
	List<Object> lO = new ArrayList<Object>();
	List<String> lS = new ArrayList<String>();
	
	List<? extends Number> lN = new ArrayList<Number>();
	
	public void print() {

	}
}
