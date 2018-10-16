package decisions;

import java.util.Scanner;

public class RelationalOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How tall are you in inches?");
		int height = input.nextInt();
		System.out.println("What is your shoe size?");
		int shoe = input.nextInt();
		System.out.println("The sum of the height and shoe size are greater than 26:");
		System.out.println(height + shoe >= 26);
	}

}
