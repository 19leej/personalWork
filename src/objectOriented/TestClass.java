package objectOriented;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter bob = new Greeter();
		Friend john = new Friend();
		Friend jenny = new Friend();
		Friend billy = new Friend();
		Friend sammy = new Friend();
		Friend kyle = new Friend();
		Dog buddy = new Dog();
		bob.sayHello();
		bob.sayHello();
		bob.sayHello();
		john.sayMessage();
		bob.sayHello();
		billy.sayMessage();
		kyle.sayMessage();
		buddy.woof();
		buddy.attack();
	}

}
