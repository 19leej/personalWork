package searching;

import java.util.Scanner;
import java.util.Random;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randall = new Random();
		Scanner input = new Scanner(System.in);
		int[] number = new int[100];
		for (int counter = 0; counter < number.length; counter++) {
			number[counter] = 0 + randall.nextInt(499 - 0 + 1);
		}
		System.out.println("What is your number?");
		int choice = input.nextInt();
		int instance = 0;
		for (int counter = 0; counter < number.length; counter++) {
			if (number[counter] == choice) {
				instance++;
			}
		}
		System.out.println("Your number is in the array " + instance + " time(s).");
		input.close();
	}

}
