package mathOperators;

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = -999.0;
		double volume = -999.0;
		System.out.println("What is the radius of the sphere in inches?");
		radius = input.nextDouble();
		volume = (4.0/3.0) * radius * radius * radius * Math.PI;
		System.out.println("The sphere has a volume of " + volume + " inches cubed.");
	}

}
