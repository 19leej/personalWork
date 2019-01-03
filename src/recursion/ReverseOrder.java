package recursion;

import java.util.Scanner;

public class ReverseOrder {

	public static int reverse(int number) {
		int quit = 0;
		int repeat = 0;
		int asdf = 0;
		double number2 = number;
		for (int counter = 0; counter == 0; counter = quit) {
			if (number2 / 10.0 > 1) {
				repeat++;
				number2 = number2 / 10.0;
			} else {
				quit = 1;
			}
		}
		if (repeat > 0) {
			int mod = number;
			number = number / 10;
			mod = number % 10;
			mod = mod * (int)Math.pow(10, repeat);
			return mod + reverse(number);
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the integer?");
		int num = input.nextInt();
		System.out.println("Result: " + reverse(num));
		input.close();
	}

}
