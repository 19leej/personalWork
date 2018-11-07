package randomNumbers;

import java.util.Random;

public class FlipACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randall = new Random();
		int counter = 0;
		int counter2 = 0;
		int head = 0;
		int smallest = 100000;
		int biggest = 0;
		for (counter = 1; counter <= 1000; counter++) {
			for (counter2 = 1; counter2 <= 100000; counter2++) {
				int flip = 0 + randall.nextInt(1 - 0 + 1);
				if (flip == 1) {
					head++;
				}
			}
			if (head > biggest) {
				biggest = head;
			}
			if (head < smallest) {
				smallest = head;
			}
			head = 0;
		}
		System.out.println("Biggest: " + biggest);
		System.out.println("Smallest: " + smallest);
		System.out.println("Biggest percentage: " + (double) biggest / 100000);
		System.out.println("Smallest percentage: " + (double) smallest / 100000);
	}

}
