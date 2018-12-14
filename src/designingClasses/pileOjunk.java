package designingClasses;

import java.util.Random;

public class pileOjunk {
	private int idNumber;
	private int number;
	Random randall = new Random();
	public pileOjunk(int newId) {
		idNumber = newId;
		number = 10 + randall.nextInt(100 - 10 + 1);
	}
	public int add (int one, int two) {
		int sum = one + two;
		return sum;
	}
	public int overwrite(int number) {
			this.number = number;
			return number;
	}
	public int getID() {
		return number;
	}
	public int getNumber() {
		return number;
	}
}
