package arrays;

import java.util.Scanner;

public class Arrays10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please write a sentence.");
		String sentence = input.nextLine();
		System.out.println("What is the key word?");
		String key = input.nextLine();
		String[] words = sentence.split(" ");
		int counter = 0;
		int appear = 0;
		for (counter = 0; counter < words.length; counter++) {
			if (words[counter].equals(key) == true) {
				appear++;
			}
		}
		System.out.println("The keyword '" + key + "' appears " + appear + " times.");
		input.close();
	}

}
