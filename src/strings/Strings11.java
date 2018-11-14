package strings;

import java.util.Scanner;

public class Strings11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		int counter = 0;
		for (counter = 0; counter < sentence.length(); counter += 4) {
			System.out.println(sentence.charAt(counter));
		}
		input.close();
	}

}
