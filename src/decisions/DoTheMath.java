package decisions;

import java.util.Scanner;

public class DoTheMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first number?");
		double first = input.nextDouble();
		System.out.println("What is the second number?");
		double second = input.nextDouble();
		System.out.println("Please choose one:");
		System.out.println(
				"1. Find the sum\n2. Find the difference\n3. Find the product\n4. Find the result of division\n5. Find the result of squaring the first number.");
		int choice = input.nextInt();
		double number = -999.0;
		switch (choice) {
		case 1:
			number = first + second;
			System.out.println("The sum is " + number + ".");
			break;
		case 2:
			if (first >= second) {
				number = first - second;
				System.out.println("The difference is " + number + ".");

			} else {
				number = second - first;
				System.out.println("The difference is " + number + ".");
			}
			break;
		case 3:
			number = first * second;
			System.out.println("The product is " + number + ".");
			break;
		case 4:
			number = first / second;
			System.out.println("The result of division is " + number + ".");
			break;
		case 5:
			number = first * first;
			System.out.println("The result of squaring the first number is " + number + ".");
			break;
		default:
			System.out.println("You didn't input an integer between 1 and 5!!");
		}
		input.close();
	}

}
