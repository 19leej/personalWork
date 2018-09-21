package mathOperators;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = -999.0;
		double area = -999;
		System.out.println("What is the radius of the circle in inches?");
		radius = input.nextDouble();
		area = 3.14159265 * radius * radius;
		System.out.println("The circle has an area of " + area + " square inches.");

	}

}
