package loops;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int choice = 0;
		while (choice != 9999) {
			sum += choice;
			System.out.println("Please enter a number.(9999 to quit)");
			choice = input.nextInt();
		}
		System.out.println("The sum of the numbers entered is: " + sum);
		input.close();
	}

}
