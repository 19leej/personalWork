package strings;

import java.util.Scanner;

public class Strings13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your SSN?");
		String ssn = input.nextLine();
		System.out.println("Last four digits: " + ssn.substring(7, 11));
		System.out.println("Middle two: " + ssn.substring(4, 6));
		System.out.println("First three: " + ssn.substring(0, 3));
		input.close();
	}

}
