package randomNumbers;

import java.util.Scanner;
import java.util.Random;

public class RollADie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random randall = new Random();
		int counter = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		System.out.println("How many rolls?");
		int roll = input.nextInt();
		for (counter = 1; counter <= roll; counter++) {
			int number = 1 + randall.nextInt(6 - 1 + 1);
			if (number == 1) {
				one++;
			} else {
				if (number == 2) {
					two++;
				} else {
					if (number == 3) {
						three++;
					} else {
						if (number == 4) {
							four++;
						} else {
							if (number == 5) {
								five++;
							} else {
								six++;
							}
						}
					}
				}
			}
		}
		double percent1 = (double) one / roll;
		double percent2 = (double) two / roll;
		double percent3 = (double) three / roll;
		double percent4 = (double) four / roll;
		double percent5 = (double) five / roll;
		double percent6 = (double) six / roll;
		System.out.println("One: " + one + "  " + percent1);
		System.out.println("Two: " + two + "  " + percent2);
		System.out.println("Three: " + three + "  " + percent3);
		System.out.println("Four: " + four + "  " + percent4);
		System.out.println("Five: " + five + "  " + percent5);
		System.out.println("Six: " + six + "  " + percent6);
		input.close();
	}

}
