package loops;

import java.util.Scanner;

public class NestedPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What number do you want to look at?");
		int number = input.nextInt();
		int counter = 0;
		int repeat = 0;
		int stuff = 0;
		int counter2 = 0;
		int counter3 = 0;
		for (counter = 2; counter <= 100; counter = counter + 1) {
			for (counter2 = 1; counter2 > 0; counter = counter2 - 1) {
				stuff = number;
				if (stuff % counter == 0) {
					counter2++;
					repeat++;
					stuff = stuff / counter2;
				}
				for (counter3 = repeat; counter3 >= 0; counter3 = counter3 - 1) {
					System.out.println(counter2);
				}
			}
			repeat = 0;
		}
		System.out.println();
	}

}
