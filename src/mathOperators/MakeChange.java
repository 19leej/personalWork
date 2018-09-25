package mathOperators;

import java.util.Scanner;

import java.math.BigDecimal;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double change = -999.0;
		int ones = -999;
		double quarters = -999;
		int dimes = -999;
		int nickels = -999;
		int pennies = -999;
		System.out.println("What is the amount of change?");
		change = input.nextDouble();
		ones = (int)change;
		change = change - ones;
		quarters = change / 0.25;
		change = change - ((int)quarters * 0.25);
		change = BigDecimal.change;
		System.out.println("Give the customer " + ones + " one's.");
		System.out.println((int)quarters);
		System.out.println(change);
		input.close();
	}

}
