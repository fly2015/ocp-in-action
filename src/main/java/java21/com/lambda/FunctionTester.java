package java21.com.lambda;

import java.util.function.Function;

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

		Integer sum = function.apply(ints);
		System.out.println(sum);
	}	
}
