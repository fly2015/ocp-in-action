package java21.com.advanced.ch_15_functional.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionTester {
	public static void main(String[] args) {
		// Number sum = 0;
		Integer[] ints = new Integer[] { 1, 2, 3, 4, 5 };
		// int sum = 0;
		Function<Integer[], Integer> function = (a) -> {
			Integer sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
			return sum;
		};

		//Integer sum = function.apply(ints);
       // System.out.println(sum);
		
		Function<Integer, Integer> function1 = (i1) -> {return i1 + 1;};
		Function<Integer, Integer> function2 = (i1) -> {return i1 + 5;};
        
        
        System.out.println(function1.andThen(function2).apply(1));
        
        
        
        List<String> strs = new ArrayList<>();
        strs.add("1");
        strs.add("2");
        
        Stream<String> stream = strs.stream();
        stream.map(s -> s + "abc").collect(Collectors.toList()).forEach(s -> System.out.println(s));
	}	
	
}
