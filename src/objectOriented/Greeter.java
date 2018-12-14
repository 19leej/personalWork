package objectOriented;

public class Greeter {
	// instance fields
	private int age;
	private String name;
	
	// default constructor
	public Greeter() {
		age = -999;
	}
	public Greeter(int newAge) {
		age = newAge;
	}
	// methods
	public void sayHello() {
		System.out.println("Hello!");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}
}
