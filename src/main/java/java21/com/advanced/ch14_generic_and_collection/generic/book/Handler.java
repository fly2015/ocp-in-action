package java21.com.advanced.ch14_generic_and_collection.generic.book;

import java21.com.advanced.ch14_generic_and_collection.generic.sdo.Animal;

public class Handler implements IHandler {

	@Override
	public <T> void ship1(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T ship2(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T ship3(Crate<T> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Crate<T> ship4(Crate<T> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Crate<T> ship5(Crate<? extends T> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Crate<? extends T> ship6(Crate<? extends T> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Crate<T> ship7(Crate<? super T> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Crate<? super T> ship8(Crate<? super T> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T ship9(Crate<? extends T> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T ship10(Crate<? super T> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Crate<?> ship11(Crate<?> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void ship12(Crate<? extends T> t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ship13(Crate<? super Animal> t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T extends Animal> T ship14(Crate<T> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Animal> T ship15(Crate<? extends Animal> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Animal> T ship16(Crate<? extends T> t) {
		// TODO Auto-generated method stub
		return null;
	}



}
