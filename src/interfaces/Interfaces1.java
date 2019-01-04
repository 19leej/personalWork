package interfaces;

import java.util.Scanner;

public class Interfaces1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length?");
		int length = input.nextInt();
		System.out.println("Width?");
		int width = input.nextInt();
		Shape bob = new Rectangle(length, width);
		System.out.println("Perimeter: " + bob.perimeter());
		System.out.println("Area: " + bob.area());
		System.out.println("What is the radius?");
		Shape bob2 = new Circle(input.nextInt());
		System.out.println("Perimeter: " + bob2.perimeter());
		System.out.println("Area: " + bob2.area());
		input.close();
	}

}
