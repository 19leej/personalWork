package decisions;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("What is your height in inches?");
			double height = input.nextDouble();
			double luckyNumber = height * 5;
			System.out.println("Your lucky number is " + luckyNumber + ".");

		} else {
			System.out.println("What is your weight in pounds?");
			double weight = input.nextDouble();
			double luckyNumber = weight / 2;
			System.out.println("Your lucky number is " + luckyNumber + ".");
		}
	}

}
