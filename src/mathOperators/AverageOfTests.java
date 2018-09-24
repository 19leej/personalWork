package mathOperators;

import java.util.Scanner;

public class AverageOfTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int test1 = -999;
		int test2 = -999;
		int test3 = -999;
		double average = -999.0;
		System.out.println("What score did you get on your first test?");
		test1 = input.nextInt();
		System.out.println("What score did you get on your second test?");
		test2 = input.nextInt();
		System.out.println("What score did you get on your third test?");
		test3 = input.nextInt();
		average = (test1 + test2 + test3) / 3;
		System.out.println("Your test scores were " + test1 + ", " + test2 + ", and " + test3 + ".");
		System.out.println("Your average score is " + average + ".");
	}

}
