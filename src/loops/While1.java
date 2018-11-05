package loops;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Which number do you want to end at?");
		int number = input.nextInt();
		int count = 0;
		int sum = 0;
		while (count <= number) {
			sum += count;
			count += 2;
		}
		System.out.println("The sum is " + sum + ".");
		input.close();
	}

}
