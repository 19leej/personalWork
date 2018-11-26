package arrays;

import java.util.Scanner;
import java.util.Random;

public class Arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random randall = new Random();
		int counter = 0;
		int max = 0;
		int size = 250;
		int[] scores = new int[size];
		for (counter = 0; counter < size; counter++) {
			scores[counter] = 0 + randall.nextInt(1000 - 0 + 1);
			System.out.println(scores[counter]);
			if (scores[counter] > max) {
				max = scores[counter];
			}
		}
		System.out.println("Largest number: " + max);
		input.close();
	}

}
