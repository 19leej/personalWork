package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add(names.size() - 1, "Jane");
		names.add(1, "Billy");
		System.out.println("What is the name?");
		names.add(input.nextLine());
		for (int one = 0; one < names.size(); one++) {
			System.out.println(names.get(one));
		}
		input.close();
	}

}
