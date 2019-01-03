package recursion;

import java.util.Scanner;

public class SumTheNumbers {

	
	public static int sum(int number) {
		if (number > 0) {
			return number + sum(number - 1);
		}
		return 0;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what is the number?");
		int number = input.nextInt();
		System.out.println(sum(number));
		input.close();
	}

}
