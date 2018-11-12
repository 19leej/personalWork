package randomNumbers;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int three = 0;
		Random randall = new Random();
		for (counter = 1; counter <= 87; counter++) {
			int number = 1 + randall.nextInt(13 - 1 + 1);
			if (number % 3 == 0) {
				three++;
			}
		}
		System.out.println("Number of times a multiple of three was rolled: " + three);
	}

}
