package java21.com.advanced.ch14_generic.doc;

public class EffectsOfTypeErasureAndBridgeMethods {
	public class Node<T> {

		public T data;
		public Node()
		{
			
		}
		public Node(T data) {
			this.data = data;
		}

		public void setData(T data) {
			System.out.println("Node.setData");
			this.data = data;
		}
		
		public void print() {
			System.out.println("Node");
		}
	}

	//Bridge Methods
	//When compiling a class or interface that extends a parameterized class or implements a parameterized interface
	//the compiler may need to create a synthetic method, which is called a bridge method, 
	// as part of the type erasure process. You normally don't need to worry about bridge methods, but you might be puzzled if one appears in a stack trace.
	public class MyNode extends Node<Integer> { 
		
		public MyNode() {}
		public MyNode(Integer data) { super(data); }

	    public void setData(Integer data) {
	        System.out.println("MyNode.setData");
	        super.setData(data);
	    }
	    
		public void print() {
			System.out.println("MyNode");
		}
	}
	
	public static void main(String[] args) {
		MyNode mn = new EffectsOfTypeErasureAndBridgeMethods(). new MyNode();
		Node n = mn;            // A raw type - compiler throws an unchecked warning
		n.setData("Hello");     // Causes a ClassCastException to be thrown.
		Integer x = mn.data;    
	}
	
	
	
}
