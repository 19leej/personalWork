package recursion;

import java.util.Scanner;

public class SumOfTheOdd {

	public static int sum(int number) {
		if (number > 0) {
			if (number % 2 ==0) {
				number--;
			}
			return number + sum(number - 2);
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number?");
		int number = input.nextInt();
		System.out.println("Result: " + sum(number));
		input.close();
	}

}
