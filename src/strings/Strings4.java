package strings;

import java.util.Scanner;

public class Strings4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		System.out.println("Index of X: " + sentence.indexOf("X"));
		input.close();
	}

}
