package randomNumbers;

import java.util.Random;

public class Yahtzee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randall = new Random();
		int counter = 0;
		int roll = 0;
		int success = 0;
		int smallest = 100000;
		int counter2 = 0;
		for (counter2 = 1; counter2 <= 100; counter2++) {
			for (counter = 0; counter == 0; counter = success) {
				int one = 1 + randall.nextInt(6);
				int two = 1 + randall.nextInt(6);
				int three = 1 + randall.nextInt(6);
				int four = 1 + randall.nextInt(6);
				int five = 1 + randall.nextInt(6);
				int six = 1 + randall.nextInt(6);
				roll++;
				if (one == two && two == three && three == four && four == five && five == six) {
					success = 1;
					if (roll < smallest) {
						smallest = roll;
					}
				}
			}
			System.out.println("It took " + roll + " rolls to get yahtzee.");
			roll = 0;
			success = 0;
		}
		System.out.println("Minimum amount of rolls: " + smallest);
	}
}
