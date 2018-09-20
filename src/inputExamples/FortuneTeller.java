package inputExamples;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean grades = false;
		int favoriteNumber = -999;
		int iq = -999;
		System.out.println("Do you have good grades?(true or false)");
		grades = input.nextBoolean();
		System.out.println("What is your favorite number?");
		favoriteNumber = input.nextInt();
		System.out.println("What is your IQ?");
		iq = input.nextInt();
		System.out.println("In the future...");
		System.out.println("You will have be successful: " + grades);
		System.out.println("Your salary will be $" + favoriteNumber + ",000 per year.");
		System.out.println("And you will be " + iq + " inches tall.");
	}

}
