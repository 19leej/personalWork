package mathOperators;

import java.util.Scanner;

public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = -999.0;
		double width = -999.0;
		double area = -999.0;
		double gallons = -999.0;
		System.out.println("What is the length of the room in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the room in feet?");
		width = input.nextDouble();
		area = (2 * (length * 8)) + (2 * (width * 8));
		gallons = area / 150;
		System.out.println(
				"The room has a length of " + length + " feet, a width of " + width + " feet, and a height of 8 feet.");
		System.out.println("The total area that needs to be painted is " + area + " square feet.");
		System.out.println(gallons + " gallons of paint are need to paint the whole room.");
	}

}
