package decisions;

import java.util.Scanner;

public class HowMuchWeigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much do you weigh in pounds?");
		double weight = input.nextDouble();
		System.out.println("In which planet do you want to know your weight?");
		System.out.println("1. Mercury\n2. Venus\n3. Mars\n4. Jupiter\n5. Saturn");
		int choice = input.nextInt();
		double newWeight = -999.0;
		switch (choice) {
		case 1:
			newWeight = weight * 0.37;
			System.out.println("Your weight on Mercury would be " + newWeight + " pounds.");
			break;
		case 2:
			newWeight = weight * 0.88;
			System.out.println("Your weight on Venus would be " + newWeight + " pounds.");
			break;
		case 3:
			newWeight = weight * 0.38;
			System.out.println("Your weight on Mars would be " + newWeight + " pounds.");
			break;
		case 4:
			newWeight = weight * 2.64;
			System.out.println("Your weight on Jupiter would be " + newWeight + " pounds.");
			break;
		case 5:
			newWeight = weight * 1.15;
			System.out.println("Your weight on Saturn would be " + newWeight + " pounds.");
			break;
		default:
			System.out.println("You didn't input an integer between 1 and 5!!");
		}
	}

}
