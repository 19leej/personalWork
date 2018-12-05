package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		int counter = 0;
		for (counter = 0; counter < 3; counter++) {
			System.out.println("What is the name?");
			names.add(input.nextLine());
		}
		names.add("Bob");
		names.add(names.size() - 1, "Jane");
		names.add(0, "Billy");
		names.add(7, "Joe");
		input.close();
	}

}
