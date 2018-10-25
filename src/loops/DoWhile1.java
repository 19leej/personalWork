package loops;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer.");
		int number = input.nextInt();
		do {
			System.out.println("Magic product: " + number * 17);
			System.out.println("Enter an integer.(9999 to quit)");
			number = input.nextInt();
		} while (number != 9999);
		input.close();
	}

}
