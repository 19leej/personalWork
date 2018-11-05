package loops;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your favorite number?");
		int number = input.nextInt();
		int counter = 0;
		for (counter = 1; counter <= number; counter = counter + 1) {
			System.out.println(number + " Hello");
		}
		input.close();
	}

}
