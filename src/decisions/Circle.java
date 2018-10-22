package decisions;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Circle: What do you wnat to do?");
		System.out.println(
				"1. Display the current radius\n2. Change the radius\n3. Display the area\n4. Display the circumference");
		int choice = input.nextInt();
		double radius = -999.0;
		double area = -999.0;
		double perimeter = -999.0;
		switch (choice) {
		case 1:
			if (radius >= 0) {
				System.out.println("The radius is " + radius + ".");
			} else {
				System.out.println("You haven't set the radius yet!");
			}
			break;
		case 2:
			System.out.println("What will the new radius be?");
			radius = input.nextDouble();
			break;
		case 3:
			area = Math.PI * radius * radius;
			System.out.println("The area is " + area + ".");
			break;
		case 4:
			perimeter = 2 * Math.PI * radius;
			System.out.println("The circumference is " + perimeter + ".");
			break;
		default:
			System.out.println("You didn't input an integer between 1 and 4!!");

		}
		System.out.println("Anything else?");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			if (radius >= 0) {
				System.out.println("The radius is " + radius + ".");
			} else {
				System.out.println("You haven't set the radius yet!");
			}
			break;
		case 2:
			System.out.println("What will the new radius be?");
			radius = input.nextDouble();
			break;
		case 3:
			area = Math.PI * radius * radius;
			System.out.println("The area is " + area + ".");
			break;
		case 4:
			perimeter = 2 * Math.PI * radius;
			System.out.println("The circumference is " + perimeter + ".");
			break;
		default:
			System.out.println("You didn't input an integer between 1 and 4!!");

		}
		input.close();
	}

}
