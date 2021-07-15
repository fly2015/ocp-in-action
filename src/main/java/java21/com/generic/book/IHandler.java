package java21.com.generic.book;

import java21.com.generic.sdo.Animal;

interface IHandler {
	<T> void ship1(T t);

	<T> T ship2(T t);
	
	<T> T ship3(Crate<T> t);
	
	<T> Crate<T> ship4(Crate<T> t);
	
	<T> Crate<T> ship5(Crate<? extends T> t);
	
	<T> Crate<? extends T> ship6(Crate<? extends T> t);
	
	<T> Crate<T> ship7(Crate<? super T> t);
	
	<T> Crate<? super T> ship8(Crate<? super T> t);
	
	<T> T ship9(Crate<? extends T> t);
	
	<T> T ship10(Crate<? super T> t);
	
	<T> Crate<?> ship11(Crate<?> t);
	
	<T> void ship12(Crate<? extends T> t);
	
	void ship13(Crate<? super Animal> t);
	
	<T extends Animal> T ship14(Crate<T> t); // same ship16
	
	<T extends Animal> T ship15(Crate<? extends Animal> t);
	
	<T extends Animal> T ship16(Crate<? extends T> t);
}
