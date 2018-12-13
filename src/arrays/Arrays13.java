package arrays;

import java.util.Random;

public class Arrays13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randall = new Random();
		int[][] numbers = new int[3][7];
		int sum = 0;
		for (int counter = 0; counter < numbers.length; counter++) {
			for (int counter2 = 0; counter2 < numbers[0].length; counter2++) {
				numbers[counter][counter2] = 0 + randall.nextInt(100 - 0 + 1);
			}
		}
		for (int counter = 0; counter < numbers.length; counter++) {
			for (int counter2 = 0; counter2 < numbers[0].length; counter2++) {
				sum += numbers[counter][counter2];
			}
		}
		System.out.println("Sum: " + sum);
	}
}
