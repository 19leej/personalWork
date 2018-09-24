package mathOperators;

import java.util.Scanner;

public class LongDivisionRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int dividend = -999;
		int divisor = -999;
		int number = -999;
		int remainder = -999;
		System.out.println("What is the dividend?");
		dividend = input.nextInt();
		System.out.println("What is the divisor?");
		divisor = input.nextInt();
		number = dividend / divisor;
		remainder = dividend % divisor;
		System.out.println("The result is " + number + " with a remainder of " + remainder + ".");
	}

}
