package randomNumbers;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int heads = 0;
		int tails = 0;
		Random randall = new Random();
		for (counter = 1; counter <= 100000; counter++) {
			int randomNum = 0 + randall.nextInt(1 + 1);
			if (randomNum == 1) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Number of heads: " + heads);
		System.out.println("Number of tails: " + tails);
	}

}
