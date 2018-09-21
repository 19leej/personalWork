package mathOperators;

import java.util.Scanner;

public class BoxVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double width = -999.0;
		double length = -999.0;
		double height = -999.0;
		double volume = -999.0;
		System.out.println("What is the width of the box in inches?");
		width = input.nextDouble();
		System.out.println("What is the length of the box in inches?");
		length = input.nextDouble();
		System.out.println("What is the height of the box in inches?");
		height = input.nextDouble();
		volume = width * length * height;
		System.out.println("The box is " + volume + " inches cubed.");
	}

}
