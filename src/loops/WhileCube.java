package loops;

import java.util.Scanner;

public class WhileCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What number do you want the cube of?(-1 to quit)");
		int choice = input.nextInt();
		int result = 0;
		while (choice != -1) {
			result = choice * choice * choice;
			System.out.println("Result: " + result);
			System.out.println("Another number?(-1 to quit)");
			choice = input.nextInt();
		}
		input.close();
	}

}
