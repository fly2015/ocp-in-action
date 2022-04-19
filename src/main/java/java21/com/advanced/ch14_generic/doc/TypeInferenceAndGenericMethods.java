package java21.com.advanced.ch14_generic.doc;

public class TypeInferenceAndGenericMethods {
	public class Box<T> {
        // T stands for "Type"
        private T t;

        public void set(T t) { this.t = t; }
        public T get() { return t; }
    }
	 
	public static <U> void addBox(U u, java.util.List<Box<U>> boxes) {
		Box<U> box = new TypeInferenceAndGenericMethods(). new Box<>();
		box.set(u);
		boxes.add(box);
	}
	
	public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
	    int counter = 0;
	    for (Box<U> box: boxes) {
	      U boxContents = box.get();
	      System.out.println("Box #" + counter + " contains [" +
	             boxContents.toString() + "]");
	      counter++;
	    }
	  }

		public static void main(String[] args) {
			java.util.ArrayList<Box<Integer>> listOfIntegerBoxes = new java.util.ArrayList<>();
			TypeInferenceAndGenericMethods.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
			//  if you omit the type witness,a Java compiler automatically infers (from the method's arguments) that the type parameter is Integer:
			TypeInferenceAndGenericMethods.addBox(Integer.valueOf(20), listOfIntegerBoxes); 
			TypeInferenceAndGenericMethods.addBox(Integer.valueOf(30), listOfIntegerBoxes);
			TypeInferenceAndGenericMethods.outputBoxes(listOfIntegerBoxes);
		}
	}
