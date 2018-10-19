package decisions;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first test score?");
		double first = input.nextDouble();
		System.out.println("What is your second test score?");
		double second = input.nextDouble();
		System.out.println("What is your third test score?");
		double third = input.nextDouble();
		double average = (first + second + third) / 3;
		System.out.println("Your letter grade is:");
		if (average >= 92.5) {
			System.out.println("A");
		} else {
			if (average >= 84.5) {
				System.out.println("B");
			} else {
				if (average >= 77.5) {
					System.out.println("C");
				} else {
					if (average >= 69.5) {
						System.out.println("D");
					} else {
						System.out.println("F");
					}
				}
			}
		}
		input.close();
	}

}
