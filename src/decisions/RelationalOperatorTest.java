package decisions;

import java.util.Scanner;

public class RelationalOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("How tall are you in inches?");
		int height = input.nextInt();
		System.out.println("What is your shoe size?");
		int shoe = input.nextInt();
		System.out.println("Is the user's height less than 62 inches and is the user's shoe size greater than 9?");
		System.out.println(height < 62 && shoe > 9);
		*/
		/*
		System.out.println("How many pets do you have?");
		int pet = input.nextInt();
		System.out.println("How many cars fit in your garage?");
		int car = input.nextInt();
		System.out.println("Does the user have at least 5 pets or\ncan the user fit more than 3 cars in their garage?");
		System.out.println(pet >= 5 || car > 3);
		*/
		System.out.println("What score did you get on your first test?");
		double first = input.nextDouble();
		System.out.println("What score did you get on your second test?");
		double second = input.nextDouble();
		if (first > second) {
			System.out.println("Great job, you put the scores in the right order.");
			double difference = first - second;
			System.out.println("Difference of scores: " + difference);
		}
		System.out.println("Have a nice day!");
	}

}
