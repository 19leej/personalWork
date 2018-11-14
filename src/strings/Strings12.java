package strings;

import java.util.Scanner;

public class Strings12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		int counter = 0;
		for (counter = 0; counter < sentence.length(); counter++) {
			if (sentence.charAt(counter) == 'a' || sentence.charAt(counter) == ' ') {
			} else {
				System.out.print(sentence.charAt(counter));
			}
		}
		System.out.println();
		System.out.println("Original sentence: " + sentence);
		input.close();
	}

}
