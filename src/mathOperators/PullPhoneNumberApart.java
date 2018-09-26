package mathOperators;

import java.util.Scanner;

public class PullPhoneNumberApart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long number = -999;
		long area = -999;
		long middle = -999;
		long last = -999;
		System.out.println("What is your phone number?");
		number = input.nextLong();
		area = number / 10000000;
		last = number % 10000;
		middle = number - (area * 10000000) - last;
		middle = middle / 10000;
		System.out.println("Your phone number is " + area + "-" + middle + "-" + last + ".");
		System.out.println("The area code of your phone number is " + area + ".");
		System.out.println("The middle 3 digits of your phone number are " + middle + ".");
		System.out.println("The last 4 digits of your phone number are " + last + ".");
		input.close();
	}

}
