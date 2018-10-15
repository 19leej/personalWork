package objectOriented;

import java.util.Scanner;

public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Greeter bob = new Greeter();
		System.out.println(bob.getAge());
		System.out.println("What is your age?");
		bob.setAge(input.nextInt());
		System.out.println("Your age is " + bob.getAge() + ".");
		input.close();
	}
}
