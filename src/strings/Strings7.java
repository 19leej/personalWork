package strings;

import java.util.Scanner;

public class Strings7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence);
		input.close();
	}

}
