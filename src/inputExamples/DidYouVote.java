package inputExamples;

import java.util.Scanner;

public class DidYouVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vote = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Did you vote?(true or false)");
		vote = input.nextBoolean();
		System.out.println("Voted: " + vote);
	}

}
