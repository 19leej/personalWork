package randomNumbers;

import java.util.Random;

public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randall = new Random();
		int counter = 0;
		int roll = 0;
		int success = 0;
		for (counter = 0; counter == 0; counter = success) {
			int one = 1 + randall.nextInt(6);
			int two = 1 + randall.nextInt(6);
			int three = 1 + randall.nextInt(6);
			int four = 1 + randall.nextInt(6);
			int five = 1 + randall.nextInt(6);
			int six = 1 + randall.nextInt(6);
			System.out.println(one + " " + two + " " + three + " " + four + " " + five + " " + six);
			roll++;
			if (one == two && two == three && three == four && four == five && five == six) {
				success = 1;
			}
		}
		System.out.println("It took " + roll + " rolls to get yahtzee.");
	}

}
