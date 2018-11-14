package strings;

import java.util.Scanner;

public class Strings8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first name?");
		String name1 = input.nextLine();
		System.out.println("What is the second name?");
		String name2 = input.nextLine();
		if (name1.compareTo(name2) > 0) {
			System.out.println(name2.toUpperCase());
		} else {
			System.out.println(name1.toUpperCase());
		}
		input.close();
	}
	
}
