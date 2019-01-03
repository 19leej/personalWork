package review;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random randall = new Random();
		ArrayList<Integer> dice = new ArrayList<Integer>();
		for (int one = 0; one < 487; one++) {
			dice.add(1 + randall.nextInt(6 - 1 + 1));
		}
		for (int one = dice.size() - 1; one >= 0; one--) {
			System.out.print(dice.get(one) + " ");
			if (one % 20 == 0) {
				System.out.println();
			}
		}
		int sum = 0;
		for (Integer x : dice) {
			if (x % 2 != 0) {
				sum++;
			}
		}
		double odd = (double) sum / 487;
		System.out.println("Odd Percentage: " + odd);
	}

}
