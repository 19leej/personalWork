package mathOperators;

import java.util.Scanner;

public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int limit = -999;
		int speed = -999;
		int difference = -999;
		int fine = -999;
		System.out.println("What is the speed limit in mph?");
		limit = input.nextInt();
		System.out.println("What was the driver's speed?");
		speed = input.nextInt();
		difference = speed - limit;
		difference = difference - 1;
		fine = 55;
		fine = fine + (difference * 40);
		System.out.println("The speed limit is " + limit + " mph.");
		System.out.println("The driver's speed was " + speed + " mph.");
		System.out.println("The fine is $" + fine + ".");
	}

}
