package decisions;

import java.util.Scanner;

public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much money did you receive for your fifth birthday?");
		double money = input.nextDouble();
		double lottery = Math.sqrt(84.3);
		if (Math.abs(money - lottery) < 0.005) {
			System.out.println("You have won a good prize!!");
		} else {
			System.out.println("You have won a bad prize!!");
		}
	}

}