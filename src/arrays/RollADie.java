package arrays;

import java.util.Scanner;
import java.util.Random;

public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random randall = new Random();
		int roll = 10000;
		int[] die = new int[roll];
		int counter = 0;
		int quit = 0;
		int request = 0;
		int occurence = 0;
		for (counter = 0; counter < die.length; counter++) {
			die[counter] = 1 + randall.nextInt(6 - 1 + 1);
		}
		for (quit = 0; quit == 0; quit = request) {
			System.out.println("What number do you want to look at?(9999 to quit)");
			int number = input.nextInt();
			if (number == 9999) {
				request = 9999;
			} else {
				for (counter = 0; counter < die.length; counter++) {
					if (die[counter] == number) {
						occurence++;
					}
				}
				System.out.println("The number " + number + " appears " + occurence + " times.");
				occurence = 0;
			}
		}
		input.close();
	}

}
