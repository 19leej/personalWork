package loops;

import java.util.Scanner;

import objectOriented.Circle;

public class DoWhileCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radious of your first circle?");
		double radius1 = input.nextDouble();
		System.out.println("What is the radious of your second circle?");
		double radius2 = input.nextDouble();
		System.out.println("What is the radious of your third circle?");
		double radius3 = input.nextDouble();
		Circle bob = new Circle();
		do {
			if (radius1 > 0) {
				bob.setRadius(radius1);
				System.out.println("Perimeter: " + bob.perimeter());
			}

			if (radius2 > 0) {
				bob.setRadius(radius2);
				System.out.println("Perimeter 2: " + bob.perimeter());
			}
			if (radius3 > 0) {
				bob.setRadius(radius3);
				System.out.println("Perimeter 3: " + bob.perimeter());
			}

			System.out.println("What is the radious of your first circle?(999 to quit)");
			radius1 = input.nextDouble();
			if (radius1 != 999) {
				System.out.println("What is the radious of your second circle?");
				radius2 = input.nextDouble();
				System.out.println("What is the radious of your third circle?");
				radius3 = input.nextDouble();
			}
		} while (radius1 != 999);
		input.close();
	}
}
