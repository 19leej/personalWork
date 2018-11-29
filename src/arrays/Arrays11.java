package arrays;

import java.util.Scanner;
import java.util.Random;

public class Arrays11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random randall = new Random();
		System.out.println("Please enter a sentence.");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		int counter = 0;
		int quit = 0;
		for (counter = 0; counter == 0; counter = quit) {
			System.out.println("A random word is: " + words[0 + randall.nextInt(words.length - 1 - 0 + 1)]);
			System.out.println("Continue?(0: Yes, 1: No)");
			quit = input.nextInt();
			input.nextLine();
		}
		input.close();
	}
}
