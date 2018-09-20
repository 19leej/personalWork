package inputExamples;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int digit1 = -999;
		int digit2 = -999;
		int digit3 = -999;
		System.out.println("Input a digit for your 3-digit password.");
		digit1 = input.nextInt();
		System.out.println("Second digit?");
		digit2 = input.nextInt();
		System.out.println("Third digit?");
		digit3 = input.nextInt();
		System.out.println("Combination One: " + digit1 + " " + digit2 + " " + digit3);
		System.out.println("Combination Two: " + digit1 + " " + digit3 + " " + digit2);
		System.out.println("Combination Three: " + digit2 + " " + digit1 + " " + digit3);
		System.out.println("Combination Four: " + digit2 + " " + digit3 + " " + digit1);
		System.out.println("Combination Five: " + digit3 + " " + digit1 + " " + digit2);
		System.out.println("Combination Six: " + digit3 + " " + digit2 + " " + digit1);
	}

}
