package randomNumbers;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randall = new Random();
		int counter = 0;
		int three = 0;
		for (counter = 1; counter <= 248; counter++) {
			int number = 26 + randall.nextInt(43 - 26 + 1);
			if (number > 36) {
				three++;
			}
		}
		System.out.println(three + " of the first graders are taller than three feet.");
	}

}
