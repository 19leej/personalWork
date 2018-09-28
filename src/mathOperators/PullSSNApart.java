package mathOperators;

import java.util.Scanner;

public class PullSSNApart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = -999;
		int yearsLeft = -999;
		int ssn = -999;
		int lastFour = -999;
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("What is your Social Security Number?");
		ssn = input.nextInt();
		yearsLeft = 18 - age;
		lastFour = ssn % 10000;
		System.out.println("You are " + age + " years old.");
		System.out.println(yearsLeft + " year(s) left till you turn 18.");
		System.out.println("The last four digits of your SSN are " + lastFour + ".");
		input.close();
	}

}
