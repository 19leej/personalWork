package loops;

import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int counter = 0;
		for (counter = 1; counter <= 5; counter ++) {
			System.out.println("Enter a number:");
			int number = input.nextInt();
			sum += number;
		}
		System.out.println("The sum of the numbers is " + sum + ".");
		input.close();
	}

}
