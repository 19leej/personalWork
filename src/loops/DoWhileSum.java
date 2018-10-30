package loops;

import java.util.Scanner;

public class DoWhileSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first number?");
		int first = input.nextInt();
		System.out.println("Second Number?");
		int second = input.nextInt();
		do {
			int sum = first + second;
			System.out.println("Sum: " + sum);
			System.out.println("First number?(999 to quit)");
			first = input.nextInt();
			if (first != 999) {
				System.out.println("Second number?");
				second = input.nextInt();
			}
		} while (first != 999);
		input.close();
	}

}
