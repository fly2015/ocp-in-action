package java21.com.generic.doc;

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
