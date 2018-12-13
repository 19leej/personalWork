package arrays;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		int counter2 = 25000;
		int counter = 0;
		for (counter = 1; counter <= 5; counter++) {
			System.out.println("What is the score of test " + counter + "?");
			scores[counter - 1] = counter2;
			counter2--;
		}
		for (counter = 0; counter <= 4; counter++) {
			System.out.println(scores[counter]);
		}
		input.close();
	}

}
