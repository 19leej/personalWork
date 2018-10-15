package objectOriented;

import java.util.Scanner;

public class Room {
	public Room() {
	}

	public void area() {
		Scanner input = new Scanner(System.in);
		double length = -999.0;
		double width = -999.0;
		double area = -999.0;
		System.out.println("What is the length of the wall in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the wall in feet?");
		width = input.nextDouble();
		area = length * width;
		System.out.println("The wall has an area of " + area + " square feet.");

	}

	public void areaWithDoor() {
		Scanner input = new Scanner(System.in);
		double wallLength = -999.0;
		double wallWidth = -999.0;
		double doorLength = -999.0;
		double doorWidth = -999.0;
		double area = -999.0;
		System.out.println("What is the length of the wall in feet?");
		wallLength = input.nextDouble();
		System.out.println("What is the width of the wall in feet?");
		wallWidth = input.nextDouble();
		System.out.println("What is the length of the door in feet?");
		doorLength = input.nextDouble();
		System.out.println("What is the width of the door in feet?");
		doorWidth = input.nextDouble();
		area = (wallLength * wallWidth) - (doorLength * doorWidth);
		System.out.println("The wall has an area of " + area + " square feet.");
		input.close();

	}
}
