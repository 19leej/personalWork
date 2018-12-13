package arrays;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		int counter = 0;
		for (counter = 1; counter <= 5; counter++) {
			System.out.println("What is the score of test " + counter + "?");
			scores[counter - 1] = input.nextDouble();
		}
		double sum = 0.0;
		for (counter = 0; counter <= 4; counter++) {
			sum += scores[counter];
		}
		System.out.println("Sum of test scores: " + sum);
		input.close();
	}

}
