package java21.com.generic.example;

import java.util.function.Function;
import java.util.function.Predicate;

public class ValidationTester {
	public static void main(String[] args) throws Exception {
		User user = new User();
		
		Validator<User> uValidator = Validator.of(user);
		Predicate<User> validation = null;
		uValidator.validate(validation, "");
		
		
	}
}
