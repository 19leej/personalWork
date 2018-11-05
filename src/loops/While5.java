package loops;

import java.util.Scanner;

public class While5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double number = 0.0;
		double biggest = 0.0;
		System.out.println("Please enter a number.(9999 to quit)");
		number = input.nextDouble();
		while (number != 9999) {
			if (biggest > number) {
				System.out.println("Please enter a number.(9999 to quit)");
				number = input.nextDouble();
			} else {
				biggest = number;
				System.out.println("Please enter a number.(9999 to quit)");
				number = input.nextDouble();
			}
		}
		System.out.println("The biggest number inputted is " + biggest + ".");
		input.close();
	}

}
