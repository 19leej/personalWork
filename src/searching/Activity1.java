package searching;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random randall = new Random();
		ArrayList<Integer> scores = new ArrayList<Integer>();
		for (int counter = 0; counter < 1000; counter++) {
			scores.add(400 + randall.nextInt(1600 - 400 + 1));
		}
		System.out.println("What is the score?");
		int search = input.nextInt();
		boolean match = false;
		for (int counter = 0; counter < 1000; counter++) {
			if (scores.get(counter) == search) {
				match = true;
				break;
			}
		}
		System.out.println("Score in the ArrayList: " + match);
		input.close();
	}

}
