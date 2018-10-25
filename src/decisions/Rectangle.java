package decisions;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Rectangle: What do you want to do?");
		System.out.println(
				"1. Display the state of the rectangle\n2. Change the length \n3. Change the width\n4. Display the area\n5. Display the perimeter");
		double length = -999.0;
		double width = -999.0;
		double area = -999.0;
		double perimeter = -999.0;
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			if (length > 0 && width > 0) {
				System.out.println("The length of the rectangle is " + length + " and the width is " + width + ".");
			} else {
				System.out.println("You didn't correct configure width and/or length yet!!");
			}
			break;
		case 2:
			System.out.println("What is the new length?");
			length = input.nextDouble();
			break;
		case 3:
			System.out.println("What is the new width?");
			width = input.nextDouble();
			break;
		case 4:
			area = length * width;
			System.out.println("The area is " + area + ".");
			break;
		case 5:
			perimeter = (2 * length) + (2 * width);
			System.out.println("The perimeter is " + perimeter + ".");
			break;
		default:
			System.out.println("You didn't input an integer between 1 and 5!!");
		}
		System.out.println("Anything else?");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			if (length > 0 && width > 0) {
				System.out.println("The length of the rectangle is " + length + " and the width is " + width + ".");
			} else {
				System.out.println("You didn't correct configure width and/or length yet!!");
			}
			break;
		case 2:
			System.out.println("What is the new length?");
			length = input.nextDouble();
			break;
		case 3:
			System.out.println("What is the new width?");
			width = input.nextDouble();
			break;
		case 4:
			area = length * width;
			System.out.println("The area is " + area + ".");
			break;
		case 5:
			perimeter = (2 * length) + (2 * width);
			System.out.println("The perimeter is " + perimeter + ".");
			break;
		default:
			System.out.println("You didn't input an integer between 1 and 5!!");
		}
		System.out.println("Anything else?");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			if (length > 0 && width > 0) {
				System.out.println("The length of the rectangle is " + length + " and the width is " + width + ".");
			} else {
				System.out.println("You didn't correct configure width and/or length yet!!");
			}
			break;
		case 2:
			System.out.println("What is the new length?");
			length = input.nextDouble();
			break;
		case 3:
			System.out.println("What is the new width?");
			width = input.nextDouble();
			break;
		case 4:
			area = length * width;
			System.out.println("The area is " + area + ".");
			break;
		case 5:
			perimeter = (2 * length) + (2 * width);
			System.out.println("The perimeter is " + perimeter + ".");
			break;
		default:
			System.out.println("You didn't input an integer between 1 and 5!!");
		}
		System.out.println("Anything else?");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			if (length > 0 && width > 0) {
				System.out.println("The length of the rectangle is " + length + " and the width is " + width + ".");
			} else {
				System.out.println("You didn't correct configure width and/or length yet!!");
			}
			break;
		case 2:
			System.out.println("What is the new length?");
			length = input.nextDouble();
			break;
		case 3:
			System.out.println("What is the new width?");
			width = input.nextDouble();
			break;
		case 4:
			area = length * width;
			System.out.println("The area is " + area + ".");
			break;
		case 5:
			perimeter = (2 * length) + (2 * width);
			System.out.println("The perimeter is " + perimeter + ".");
			break;
		default:
			System.out.println("You didn't input an integer between 1 and 5!!");
		}
		System.out.println("Anything else?");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			if (length > 0 && width > 0) {
				System.out.println("The length of the rectangle is " + length + " and the width is " + width + ".");
			} else {
				System.out.println("You didn't correct configure width and/or length yet!!");
			}
			break;
		case 2:
			System.out.println("What is the new length?");
			length = input.nextDouble();
			break;
		case 3:
			System.out.println("What is the new width?");
			width = input.nextDouble();
			break;
		case 4:
			area = length * width;
			System.out.println("The area is " + area + ".");
			break;
		case 5:
			perimeter = (2 * length) + (2 * width);
			System.out.println("The perimeter is " + perimeter + ".");
			break;
		default:
			System.out.println("You didn't input an integer between 1 and 5!!");
		}
		input.close();
	}

}
