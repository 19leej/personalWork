package strings;

import java.util.Scanner;

public class AgeAndName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("age?");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("name?");
		String name = input.nextLine();
		System.out.println("You are " + name + " and you're " + age + " years old");
		input.close();
	}

}
