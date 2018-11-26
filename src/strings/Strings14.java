package strings;

import java.util.Scanner;

public class Strings14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Essay eric = new Essay();
		System.out.println("What is the name of the author?");
		eric.setName(input.nextLine());
		System.out.println("What is the essay text?");
		eric.setText(input.nextLine());
		System.out.println("Last name: " + eric.lastName());
		System.out.println("Number of characters in first name: " + eric.charFirst());
		System.out.println("Author's name contains 'X': " + eric.charX());
		System.out.println("Number of words in essay: " + eric.length());
		input.close();
	}

}
