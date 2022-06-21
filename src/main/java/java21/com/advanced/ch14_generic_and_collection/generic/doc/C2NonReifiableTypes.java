package java21.com.advanced.ch14_generic_and_collection.generic.doc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * A reifiable type is a type whose type information is fully available at runtime. 
 * This includes primitives, non-generic types, raw types, and invocations of unbound wildcards.
 */

/*
 * Non-reifiable types are types where information has been removed at compile-time by type erasure
 */
public class C2NonReifiableTypes {
	
    
}

// Potential Vulnerabilities of Varargs Methods with Non-Reifiable Formal Parameters
// Generic methods that include vararg input parameters can cause heap pollution.
class ArrayBuilder {

    public static <T> void addToList(List<T> listArg, T... elements)
    {
        for (T x : elements)
        {
            listArg.add(x);
        }
    }


    public static void faultyMethod(List<String>... l)
    {
        Object[] objectArray = l; // Valid
        objectArray[0] = Arrays.asList(42);
        String s = l[0].get(0); // ClassCastException thrown here
    }

  }


  class HeapPollutionExample
  {

      public static void main(String[] args)
      {

          List<String> stringListA = new ArrayList<String>();
          List<String> stringListB = new ArrayList<String>();

          ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
          ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");
          List<List<String>> listOfStringLists = new ArrayList<List<String>>();
          ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);

          ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
      }
  }
