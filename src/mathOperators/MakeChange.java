package mathOperators;

import java.util.Scanner;

import java.math.BigDecimal;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double initialChange = -999.0;
		int newChange = -999;
		int twenties = -999;
		int tens = -999;
		int fives = -999;
		int ones = -999;
		int quarters = -999;
		int dimes = -999;
		int nickels = -999;
		int pennies = -999;
		System.out.println("What is the amount of change?");
		initialChange = input.nextDouble();
		System.out.println("The total amount of change is $" + initialChange + ".");
		initialChange = initialChange * 100.000000000001;
		newChange = (int) initialChange;
		twenties = newChange / 2000;
		newChange = newChange - (twenties * 2000);
		tens = newChange / 1000;
		newChange = newChange - (tens * 1000);
		fives = newChange / 500;
		newChange = newChange - (fives * 500);
		ones = newChange / 100;
		newChange = newChange - (ones * 100);
		quarters = newChange / 25;
		newChange = newChange - (quarters * 25);
		dimes = newChange / 10;
		newChange = newChange - (dimes * 10);
		nickels = newChange / 5;
		newChange = newChange - (nickels * 5);
		pennies = newChange / 1;
		newChange = newChange - (pennies);
		System.out.println("Give the customer " + twenties + " twenties, " + tens + " tens, " + fives + " fives, "
				+ ones + " ones, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and "
				+ pennies + " pennies.");
		input.close();
	}

}
