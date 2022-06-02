package java21.com.advanced.ch15_functional.build_in;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, Integer> func1 = (s) -> s.length();
		Function<Integer, Integer> func2 = a -> a * 10;
		
		Integer apply = func1.andThen(func2).apply("abc");
		System.out.println(apply);
		
		
		Function<String, String> func3 = a -> a + "Hien";
		Integer apply2 = func1.compose(func3).andThen(func2).apply("abc");
		System.out.println(apply2);
	}	
}
