package strings;

import java.util.Scanner;

public class Strings10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int success = 0;
		int truth = 0;
		boolean match = false;
		for (success = 0; success == 0; success = truth) {
			System.out.println("What is your password?");
			String password1 = input.nextLine();
			System.out.println("Please verify it.");
			String password2 = input.nextLine();
			match = password1.equals(password2);
			if (match == true) {
				truth = 1;
			} else {
				System.out.println("The passwords didn't match!");
			}
		}
		input.close();
	}

}
