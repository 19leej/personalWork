package decisions;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first integer?");
		int first = input.nextInt();
		System.out.println("What is the second integer?");
		int second = input.nextInt();
		System.out.println("What is the third integer?");
		int third = input.nextInt();
		if (first > second && first > third) {
			System.out.println("The largest integer is " + first + ".");
		}
		if (second > first && second > third) {
			System.out.println("The largest integer is " + second + ".");
		}
		if (third > second && third > first) {
			System.out.println("The largest integer is " + third + ".");
		}
		input.close();
	}

}
