package inputExamples;

import java.util.Scanner;

public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstNumber = -999;
		int secondNumber = -999;
		int thirdNumber = -999;
		System.out.println("What are the first set of numbers of your locker combination?");
		firstNumber = input.nextInt();
		System.out.println("Second set of numbers?");
		secondNumber = input.nextInt();
		System.out.println("Third set of numbers?");
		thirdNumber = input.nextInt();
		System.out.println("Your locker combinaton is " + firstNumber + "-" + secondNumber + "-" + thirdNumber + ".");
	}

}
