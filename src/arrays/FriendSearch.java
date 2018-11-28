package arrays;

import java.util.Scanner;

public class FriendSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many friends do you have?");
		int number = input.nextInt();
		Friend[] fred = new Friend[number];
		input.nextLine();
		int counter = 0;
		int quit = 0;
		for (counter = 0; counter < fred.length; counter++) {
			System.out.println("What is the first and last name of your friend?");
			String name = input.nextLine();
			System.out.println("What is the age of your friend?");
			int age = input.nextInt();
			input.nextLine();
			fred[counter] = new Friend(name, age);
		}
		System.out.println("What search method do you want to use?");
		System.out.println("1. First name\n2. Last name\n3. Age\n4. Quit");
		int choice = input.nextInt();
		for (counter = 0; counter == 0; counter = quit) {
			switch (choice) {
			case 1:
				System.out.println("Please enter the first name.");
				String firstname = input.nextLine();
				for (counter = 0; counter < fred.length; counter++) {
					if (firstname == fred[counter].getFirst()) {
						System.out.println(fred[counter].getName() + ". Age " + fred[counter].getAge());
					}
				}
				break;
			case 2:
				System.out.println("Please enter the last name.");
				String lastname = input.nextLine();
				for (counter = 0; counter < fred.length; counter++) {
					if (lastname == fred[counter].getLast()) {
						System.out.println(fred[counter].getName() + ". Age " + fred[counter].getAge());
					}
				}
				break;
			case 3:
				System.out.println("Please enter the age.");
				int ages = input.nextInt();
				input.nextLine();
				for (counter = 0; counter < fred.length; counter++) {
					if (ages == fred[counter].getAge()) {
						System.out.println(fred[counter].getName() + ". Age " + fred[counter].getAge());
					}
				}
				break;
			case 4:
				quit = 1;
				break;
			default:
				System.out.println("Try again!");
			}
		}
		input.close();
	}

}
