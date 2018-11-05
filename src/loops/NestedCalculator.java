package loops;

import java.util.Scanner;

public class NestedCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Math2 bob = new Math2();
		System.out.println(
				"Functions:\n1. Right Triangle?\n2. powers\n3. square root\n4. round up\n5. round down\n6. quit");
		int choice = input.nextInt();
		int counter = 0;
		int work = 0;
		for (counter = choice; counter != 6; counter = choice) {
			switch (choice) {
			case 1:
				int truth = 0;
				System.out.println("What is the length of the first side?");
				double side1 = input.nextDouble();
				System.out.println("Second side?");
				double side2 = input.nextDouble();
				System.out.println("Third Side?");
				double side3 = input.nextDouble();
				for (int counter2 = work; work != 1; counter2 = work) {
					if (side1 > 0 && side2 > 0 && side3 > 0) {
						work = 1;
					} else {
						System.out.println("You have given invalid dimensions!");
						System.out.println("What is the length of the first side?");
						side1 = input.nextDouble();
						System.out.println("Second side?");
						side2 = input.nextDouble();
						System.out.println("Third Side?");
						side3 = input.nextDouble();
						work = 0;
					}
				}
				truth = bob.rightTri(side1, side2, side3);
				if (truth == 1) {
					System.out.println("It is a right triangle!");
				} else {
					System.out.println("It is not a right triangle");
				}
				break;
			case 2:
				System.out.println("What is the number?");
				double number = input.nextDouble();
				System.out.println("What is the power?");
				int power = input.nextInt();
				for (int counter2 = work; work != 1; counter2 = work) {
					if (power > 0) {
						work = 1;
					} else {
						System.out.println("You have entered an invalid number!");
						System.out.println("What is the number?");
						number = input.nextDouble();
						System.out.println("What is the power?");
						power = input.nextInt();
						work = 0;
					}
				}
				System.out.println("The answer is " + bob.powers(number, power));
				break;
			case 3:
				System.out.println("What is the number?");
				double number4 = input.nextDouble();
				for (int counter3 = work; work != 1; counter3 = work) {
					if (number4 > 0) {
						work = 1;
					} else {
						System.out.println("You have entered an invalid number!");
						System.out.println("What is the number?");
						number4 = input.nextDouble();
						work = 0;
					}
				}
				System.out.println("The answer is " + bob.root(number4));
				break;
			case 4:
				System.out.println("What is the number?");
				double number2 = input.nextDouble();
				System.out.println("The rounded up number is " + bob.roundUp(number2));
			case 5:
				System.out.println("What is the number?");
				double number3 = input.nextDouble();
				System.out.println("The rounded up number is " + bob.roundDown(number3));
			default:
			}
			System.out.println(
					"Functions:\n1. Right Triangle?\n2. powers\n3. square root\n4. round up\n5. round down\n6. quit");
			choice = input.nextInt();
		}
		input.close();
	}

}
