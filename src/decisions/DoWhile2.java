package decisions;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number = input.nextInt();
		int biggest = number;
		int smallest = number;
		do {
			if (number > biggest) {
				biggest = number;
			} else {
				if (number < smallest) {
					smallest = number;
				}
			}
			System.out.println("Enter an integer:(9999 to quit)");
			number = input.nextInt();
		} while (number != 9999);
		int range = biggest - smallest;
		System.out.println("The range of numbers that you entered in is " + range + ".");
		input.close();
	}

}
