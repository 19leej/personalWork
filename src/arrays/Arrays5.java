package arrays;

import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[25];
		int counter = 0;
		for (counter = 0; counter < names.length; counter++) {
			System.out.println("Friend's name?");
			names[counter] = input.nextLine();
		}
		for (counter = names.length - 1; counter >= 0; counter--) {
			System.out.println(names[counter]);
		}
		input.close();
	}

}
