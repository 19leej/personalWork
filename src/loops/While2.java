package loops;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 0;
		int choice = 0;
		System.out.println("Please enter a number.(9999 to quit)");
		choice = input.nextInt();
		while (choice != 9999) {
			number = choice * 2;
			System.out.println("Your number times two is: " + number);
			System.out.println("Please enter a number.(9999 to quit)");
			choice = input.nextInt();
		}
		input.close();
	}

}
