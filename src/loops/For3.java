package loops;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many times do you want HELLO on the Screen?");
		int hello = input.nextInt();
		int counter = 0;
		for (counter = 1; counter <= hello; counter = counter + 1) {
			System.out.println(counter + " Hello");
		}
		input.close();
	}

}
