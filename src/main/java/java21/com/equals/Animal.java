package java21.com.equals;

public class Animal {
	private String id;
	private String name;
	
	public Animal()
	{
		
	}
	public Animal(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	public static void main(String[] args) {
		Animal animal1 = new Animal("1", "Dog");
		Animal animal2 = new Animal("2", "Cat");
		
		System.out.println("animal1 == animal2: " + (animal1 == animal2));
		System.out.println("animal1 == animal2: " + (animal1.equals(animal2)));
		
		//When two objects are equal, you must override hashcode so that the hashcodes are equal too. 
		// Otherwise you will have problems when you use the object in a collection.
		System.out.println("animal1.hashCode(): " + (animal1.hashCode()));
		System.out.println("animal1.hashCode(): " + (animal2.hashCode()));
		
		String str1 = new String("A");
		String str2 = new String("A");
		String str3 = "A";
		String str4 = "A";
		System.out.println("str1==str2: " + (str1==str2));
		System.out.println("str3==str4: " + (str3==str4));
		
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str3.equals(str4): " + str3.equals(str4));
		
		System.out.println("str1.hashCode(): " + str1.hashCode());
		System.out.println("str2.hashCode(): " + str2.hashCode());
		

	}
}
