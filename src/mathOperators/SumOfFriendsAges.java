package mathOperators;

import java.util.Scanner;

public class SumOfFriendsAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int friend1 = -999;
		int friend2 = -999;
		int friend3 = -999;
		int sumfriend = -999;
		System.out.println("How old is your friend?");
		friend1 = input.nextInt();
		System.out.println("How old is your second friend?");
		friend2 = input.nextInt();
		System.out.println("How old is your third friend?");
		friend3 = input.nextInt();
		sumfriend = friend1 + friend2 + friend3;
		System.out.println("The sum of your friends' ages is " + sumfriend + ".");
	}

}
