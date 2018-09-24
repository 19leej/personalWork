package mathOperators;

import java.util.Scanner;

public class TakeATrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double distance = -999.0;
		double fuelEconomy = -999.0;
		double moneySpent = -999.0;
		double averageGallon = -999.0;
		double gasTotal = averageGallon - 999.0;
		System.out.println("How many miles was your road trip?");
		distance = input.nextDouble();
		System.out.println("How many miles per gallon do you get in your car?");
		fuelEconomy = input.nextDouble();
		System.out.println("How much money did you spend on gas?");
		moneySpent = input.nextDouble();
		gasTotal = distance / fuelEconomy;
		averageGallon = moneySpent / gasTotal;
		System.out.println("Your trip was " + distance + " miles.");
		System.out.println(gasTotal + " gallons of gas were used.");
		System.out.println("You spent $" + moneySpent + " on gas.");
		System.out.println("The average cost per gallon was $" + averageGallon + ".");

	}

}
