package loops;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double average = 0.0;
		double sum = 0.0;
		double choice = 0.0;
		int enter = 0;
		System.out.println("Please enter a number.(9999 to quit)");
		choice = input.nextDouble();
		while (choice != 9999) {
			sum += choice;
			enter++;
			System.out.println("Please enter a number.(9999 to quit)");
			choice = input.nextDouble();
		}
		average = sum / enter;
		System.out.println("The average is " + average + ".");
		input.close();
	}

}
