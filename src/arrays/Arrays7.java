package arrays;

import java.util.Scanner;

public class Arrays7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		int counter = 0;
		for (counter = 0; counter < names.length; counter++) {
			System.out.println("Friend's name?");
			names[counter] = input.nextLine();
		}
		input.nextLine();
		System.out.println("How long is the first name?");
		int first = input.nextInt();
		for (counter = 0; counter < names.length; counter++) {
			String firstname = names[counter].substring(0, names[counter].indexOf(" "));
			int firstnamelength = firstname.length();
			if (first == firstnamelength) {
				System.out.println(names[counter]);
			}
		}
		input.close();
	}

}
