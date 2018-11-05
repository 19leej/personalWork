package loops;

import java.util.Scanner;

public class NestedPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What number do you want to look at?");
		int number = input.nextInt();
		int counter = 0;
		int counter2 = 0;
		int counter3 = 0;
		int repeat = 0;
		for (counter = 2; counter <= number; counter = counter + 1) {
			for (counter2 = 1; counter2 >= 1; counter2 = counter2 - 1) {
				if (number % counter == 0) {
					counter2++;
					repeat++;
					number = number / counter;
				}
			}
			for (counter3 = repeat; counter3 >= 1; counter3 = counter3 - 1) {
				System.out.print(counter + "  ");
			}
			repeat = 0;
		}
		input.close();
	}
}
