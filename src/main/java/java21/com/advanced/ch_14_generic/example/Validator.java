package java21.com.advanced.ch_14_generic.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Validator<T> {
	private final T obj;
	
	private final List<Throwable> exceptions = new ArrayList<>();
	 
	private Validator(T obj)
	{
		this.obj = obj;
	}
	
	public static <INPUT> Validator<INPUT> of(INPUT input) {
		return new Validator<>(Objects.requireNonNull(input));
	}
	
	public Validator<T> validate(Predicate<T> validation, String message) {
		if (!validation.test(obj)) {
			exceptions.add(new IllegalStateException(message));
		}
		return this;
	}
	
	public <U> Validator<T> validate(Function<T, U> projection, Predicate<U> validation, String message) {
		Predicate<T> validation2 = projection.andThen(validation::test)::apply;
        return validate(validation2, message);
	}
	
	public T get() throws IllegalStateException {
		if (exceptions.isEmpty()) {
			return obj;
		}
		IllegalStateException e = new IllegalStateException();
		exceptions.forEach(e::addSuppressed);
		throw e;
	}
}
