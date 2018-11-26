package strings;

import java.util.Scanner;

public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		System.out.println("The sentence contains 'Bob': " + sentence.contains("Bob"));
		input.close();
	}

}
