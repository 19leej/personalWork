package arrays;

import java.util.Scanner;

public class Arrays6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		int counter = 0;
		for (counter = 0; counter < names.length; counter++) {
			System.out.println("Friend's name?");
			names[counter] = input.nextLine();
		}
		System.out.println("What letter do you want to look up?");
		String letter = input.nextLine();
		char choice = letter.charAt(0);
		for (counter = 0; counter < names.length; counter++) {
			int last = names[counter].length() - 1;
			char lastletter = names[counter].charAt(last);
			if (choice == lastletter) {
				System.out.println(names[counter]);
			}
		}
		input.close();
	}

}
