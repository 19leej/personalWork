package mathOperators;

import java.util.Scanner;

public class CuttingMoreGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double PAY = 12.0;
		double length = -999.0;
		double width = -999.0;
		double mower = -999.0;
		double speed = -999.0;
		double squareFeet = -999.0;
		double area = -999.0;
		double time = -999.0;
		double finalPay = -999.0;
		System.out.println("What is the length of the yard in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the yard in feet?");
		width = input.nextDouble();
		System.out.println("How wide is the mower deck in inches?");
		mower = input.nextDouble();
		System.out.println("How fast is the mower in mph?");
		speed = input.nextDouble();
		area = length * width;
		speed = speed * 5280;
		mower = mower / 12;
		squareFeet = speed * mower;
		time = area / squareFeet;
		finalPay = time * PAY;
		System.out.println("The total area of the yard is " + area + " square feet.");
		System.out.println("It will take " + time + " hours to mow the lawn.");
		System.out.println("The lawn will cost $" + finalPay + " to mow.");
		input.close();

	}

}
