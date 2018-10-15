package objectOriented;

public class Greeter {
	// instance fields
	private int age;

	// default constructor
	public Greeter() {
		age = -999;
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
