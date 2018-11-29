package arrays;

import java.util.Scanner;

public class Arrays9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		int counter = 0;
		for (counter = 0; counter < words.length; counter++) {
			System.out.println(words[counter].charAt(0));
		}
		input.close();
	}

}
