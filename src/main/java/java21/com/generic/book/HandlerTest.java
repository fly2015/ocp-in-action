package java21.com.generic.book;

import java21.com.generic.sdo.Animal;
import java21.com.generic.sdo.Cat;
import java21.com.generic.sdo.Dog;

public class HandlerTest {
	public static void main(String[] args) {
		IHandler handler = new Handler();
		
		//
		handler.ship1(new String());
		String ship2 = handler.ship2(new String());
		
		//
		Crate<Number> t = new Crate<Number>();
		Number ship3 = handler.ship3(t);
		
		//
		Crate<Number> t1 = new Crate<Number>();
		Crate<Number> ship4 = handler.ship4(t1);
		
		//
		Crate<Integer> t2 = new Crate<Integer>();
		Crate<Number> ship5 = handler.ship5(t2);
		
		//
		Crate<? extends Number> ship6 = handler.ship6(t1);
		
		//
		Crate<Integer> ship7 = handler.ship7(t2);
		//
		Crate<? super Integer> ship8 = handler.ship8(t2);
		
		//
		Number ship9 = handler.ship9(ship6);
		
		//
		Object ship10 = handler.ship10(ship8);
		
		// 
		Crate<?> any = ship8;
		Crate<?> ship11 = handler.ship11(any);
		
		// 
		Crate<Animal> ca = new Crate<Animal>();
		Animal ship102 = handler.ship10(ca);
		
		Crate<Dog> cd = new Crate<Dog>();
		Animal ship1021 = handler.ship10(cd);
		
		// tricky
		Crate<Cat> cc = new Crate<Cat>();
		Crate<? extends Animal> aa = new Crate<Animal>();
		Animal ship14 = handler.ship14(ca);
		Dog ship142 = handler.ship14(cd);
		Animal ship143 = handler.ship14(aa);
		Cat ship144 = handler.ship14(cc);
		
		Animal ship15 = handler.ship15(ca);
		Animal ship152 = handler.ship15(cd);
		Animal ship153 = handler.ship15(aa);
		
		Animal ship162 = handler.ship16(ca);
		Dog ship16 = handler.ship16(cd);
		Animal ship163 = handler.ship16(aa);
	}
}
