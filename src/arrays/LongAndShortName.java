package arrays;

import java.util.Scanner;

public class LongAndShortName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many people do you know?");
		int people = input.nextInt();
		input.nextLine();
		String[] names = new String[people];
		int counter = 0;
		int longest = 0;
		int shortest = 0;
		for (counter = 0; counter < names.length; counter++) {
			System.out.println("What is the first and last name of the person?");
			names[counter] = input.nextLine();
		}
		for (counter = 0; counter < names.length; counter++) {
			System.out.println(names[counter]);
		}
		for (counter = 0; counter < names.length; counter++) {
			if (names[counter].length() > names[longest].length()) {
				longest = counter;
			}
			if (names[counter].length() < names[shortest].length()) {
				shortest = counter;
			}
		}
		System.out.println("Longest name: " + names[longest]);
		System.out.println("Shortest name: " + names[shortest]);
		int range = names[longest].length() - names[shortest].length();
		System.out.println("Range of names: " + range);
		input.close();
	}

}
