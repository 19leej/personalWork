package decisions;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the temperature outside?");
		double temperature = input.nextDouble();
		if (temperature > 83) {
			System.out.println("It is swimming temperature.");
		} else {
			if (temperature > 74) {
				System.out.println("It is tennis temperature.");
			} else {
				if (temperature > 35) {
					System.out.println("It is golfing temperature.");
				} else {
					if (temperature > -10) {
						System.out.println("It is snow shoeing temperature.");
					} else {
						System.out.println("It is way too cold outside.");
					}
				}
			}
		}
		input.close();
	}

}
